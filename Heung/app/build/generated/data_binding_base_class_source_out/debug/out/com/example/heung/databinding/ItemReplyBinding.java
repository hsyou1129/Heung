// Generated by data binding compiler. Do not edit!
package com.example.heung.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.heung.R;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemReplyBinding extends ViewDataBinding {
  @NonNull
  public final Button btnReply;

  @NonNull
  public final TextInputLayout commentLayout;

  @NonNull
  public final LinearLayout editComment;

  @NonNull
  public final TextInputEditText editReply;

  protected ItemReplyBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnReply, TextInputLayout commentLayout, LinearLayout editComment,
      TextInputEditText editReply) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnReply = btnReply;
    this.commentLayout = commentLayout;
    this.editComment = editComment;
    this.editReply = editReply;
  }

  @NonNull
  public static ItemReplyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_reply, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemReplyBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemReplyBinding>inflateInternal(inflater, R.layout.item_reply, root, attachToRoot, component);
  }

  @NonNull
  public static ItemReplyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_reply, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemReplyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemReplyBinding>inflateInternal(inflater, R.layout.item_reply, null, false, component);
  }

  public static ItemReplyBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ItemReplyBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemReplyBinding)bind(component, view, R.layout.item_reply);
  }
}
