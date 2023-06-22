// Generated by data binding compiler. Do not edit!
package com.example.heung.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.example.heung.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ItemPostcontBinding extends ViewDataBinding {
  @NonNull
  public final ImageView accountIvProfile;

  @NonNull
  public final ImageButton btnReply;

  @NonNull
  public final ConstraintLayout comment;

  @NonNull
  public final RecyclerView replyRecycler;

  @NonNull
  public final TextView tvAuthor;

  @NonNull
  public final TextView tvComment;

  @NonNull
  public final TextView tvDate;

  protected ItemPostcontBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView accountIvProfile, ImageButton btnReply, ConstraintLayout comment,
      RecyclerView replyRecycler, TextView tvAuthor, TextView tvComment, TextView tvDate) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accountIvProfile = accountIvProfile;
    this.btnReply = btnReply;
    this.comment = comment;
    this.replyRecycler = replyRecycler;
    this.tvAuthor = tvAuthor;
    this.tvComment = tvComment;
    this.tvDate = tvDate;
  }

  @NonNull
  public static ItemPostcontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_postcont, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ItemPostcontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ItemPostcontBinding>inflateInternal(inflater, R.layout.item_postcont, root, attachToRoot, component);
  }

  @NonNull
  public static ItemPostcontBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.item_postcont, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ItemPostcontBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ItemPostcontBinding>inflateInternal(inflater, R.layout.item_postcont, null, false, component);
  }

  public static ItemPostcontBinding bind(@NonNull View view) {
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
  public static ItemPostcontBinding bind(@NonNull View view, @Nullable Object component) {
    return (ItemPostcontBinding)bind(component, view, R.layout.item_postcont);
  }
}
