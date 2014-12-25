package pwittchen.com.swipedetector;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MotionEvent;
import android.widget.TextView;

public class SwipeDetectorActivity extends ActionBarActivity {

    private SwipeDetector swipeDetector;
    private TextView info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        info = (TextView) findViewById(R.id.info);
        swipeDetector = new SwipeDetector(getSwipeListener());
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        swipeDetector.onTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    private SwipeDetector.SwipeListener getSwipeListener() {
        return new SwipeDetector.SwipeListener() {
            @Override
            public void onSwipingLeft(MotionEvent event) {
                info.setText("swiping left");
            }

            @Override
            public void onSwipedLeft(MotionEvent event) {
                info.setText("swiped left");
            }

            @Override
            public void onSwipingRight(MotionEvent event) {
                info.setText("swiping right");
            }

            @Override
            public void onSwipedRight(MotionEvent event) {
                info.setText("swiped right");
            }

            @Override
            public void onSwipingUp(MotionEvent event) {
                info.setText("swiping up");
            }

            @Override
            public void onSwipedUp(MotionEvent event) {
                info.setText("swiped up");
            }

            @Override
            public void onSwipingDown(MotionEvent event) {
                info.setText("swiping down");
            }

            @Override
            public void onSwipedDown(MotionEvent event) {
                info.setText("swiped down");
            }
        };
    }
}
