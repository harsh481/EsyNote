package com.example.harsh.esynote.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

import com.jkb.slidemenu.SlideMenuLayout;

/**
 * Created by Harsh on 05/02/18.
 */

public class NotelySlidingLayout extends SlideMenuLayout {
    public NotelySlidingLayout(Context context) {
        super(context);
    }

    public NotelySlidingLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NotelySlidingLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //Remove touch functionality to allow list iem to detect touch events
    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        int currentX = (int) event.getX();
        if(isRightSlideOpen()&&currentX < getSlideContentView().getRight()/2) {
            toggleRightSlide();
            return true;
        }
        return false;

    }


}
