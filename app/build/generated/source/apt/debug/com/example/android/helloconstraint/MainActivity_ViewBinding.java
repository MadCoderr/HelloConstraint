// Generated code from Butter Knife. Do not modify!
package com.example.android.helloconstraint;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mShowCount = Utils.findRequiredViewAsType(source, R.id.show_count, "field 'mShowCount'", TextView.class);
    target.btnCount = Utils.findRequiredViewAsType(source, R.id.button_count, "field 'btnCount'", Button.class);
    target.btnResetCount = Utils.findRequiredViewAsType(source, R.id.btn_rst_count, "field 'btnResetCount'", Button.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mShowCount = null;
    target.btnCount = null;
    target.btnResetCount = null;
  }
}
