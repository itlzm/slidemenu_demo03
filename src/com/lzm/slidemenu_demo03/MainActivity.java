package com.lzm.slidemenu_demo03;

import com.lzm.slidingmenu.lib.SlidingMenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * 将SlidingMenu当作普通控件 把SlidingMenu作为普通的view，然后在布局中声明
 * 
 * @author Administrator
 *
 */
public class MainActivity extends Activity {
	private SlidingMenu mLeftMenu;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		mLeftMenu = (SlidingMenu) findViewById(R.id.slidingmenulayout);
		// configure the SlidingMenu
		// SlidingMenu menu = new SlidingMenu(this);
		mLeftMenu.setMode(SlidingMenu.LEFT);
		// 设置触摸屏幕的模式
		mLeftMenu.setShadowWidthRes(R.dimen.shadow_width);
		mLeftMenu.setShadowDrawable(R.drawable.shadow);

		mLeftMenu.setMenu(R.layout.leftmenu);

		mLeftMenu.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				if (mLeftMenu.isMenuShowing())
					mLeftMenu.toggle();
			}
		});
		// 设置滑动菜单视图的宽度
		// 设置渐入渐出效果的值
		/**
		 * SLIDING_WINDOW will include the Title/ActionBar in the content
		 * section of the SlidingMenu, while SLIDING_CONTENT does not.
		 */

	}

}
