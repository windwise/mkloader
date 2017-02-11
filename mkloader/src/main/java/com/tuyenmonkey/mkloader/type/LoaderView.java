package com.tuyenmonkey.mkloader.type;

import android.graphics.Canvas;

/**
 * Created by Tuyen Nguyen on 2/11/17.
 */

public abstract class LoaderView {
  protected int color;
  protected int width, height;

  public void setColor(int color) {
    this.color = color;
  }

  public void setSize(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public abstract void calculatePosition();
  public abstract void draw(Canvas canvas);
}