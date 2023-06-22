// Generated by view binder compiler. Do not edit!
package com.example.heung.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.heung.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemPostlistBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ConstraintLayout ConstraintLayoutAlready;

  @NonNull
  public final ImageView imageView2;

  @NonNull
  public final ImageView imgComment;

  @NonNull
  public final ImageView musicIcon;

  @NonNull
  public final TextView postComment;

  @NonNull
  public final TextView postDate;

  @NonNull
  public final TextView postLikes;

  @NonNull
  public final View postLine;

  @NonNull
  public final TextView postNickname;

  @NonNull
  public final TextView postTitle;

  private ItemPostlistBinding(@NonNull ConstraintLayout rootView,
      @NonNull ConstraintLayout ConstraintLayoutAlready, @NonNull ImageView imageView2,
      @NonNull ImageView imgComment, @NonNull ImageView musicIcon, @NonNull TextView postComment,
      @NonNull TextView postDate, @NonNull TextView postLikes, @NonNull View postLine,
      @NonNull TextView postNickname, @NonNull TextView postTitle) {
    this.rootView = rootView;
    this.ConstraintLayoutAlready = ConstraintLayoutAlready;
    this.imageView2 = imageView2;
    this.imgComment = imgComment;
    this.musicIcon = musicIcon;
    this.postComment = postComment;
    this.postDate = postDate;
    this.postLikes = postLikes;
    this.postLine = postLine;
    this.postNickname = postNickname;
    this.postTitle = postTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemPostlistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemPostlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_postlist, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemPostlistBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      ConstraintLayout ConstraintLayoutAlready = (ConstraintLayout) rootView;

      id = R.id.imageView2;
      ImageView imageView2 = ViewBindings.findChildViewById(rootView, id);
      if (imageView2 == null) {
        break missingId;
      }

      id = R.id.img_comment;
      ImageView imgComment = ViewBindings.findChildViewById(rootView, id);
      if (imgComment == null) {
        break missingId;
      }

      id = R.id.music_icon;
      ImageView musicIcon = ViewBindings.findChildViewById(rootView, id);
      if (musicIcon == null) {
        break missingId;
      }

      id = R.id.post_comment;
      TextView postComment = ViewBindings.findChildViewById(rootView, id);
      if (postComment == null) {
        break missingId;
      }

      id = R.id.post_date;
      TextView postDate = ViewBindings.findChildViewById(rootView, id);
      if (postDate == null) {
        break missingId;
      }

      id = R.id.post_likes;
      TextView postLikes = ViewBindings.findChildViewById(rootView, id);
      if (postLikes == null) {
        break missingId;
      }

      id = R.id.post_line;
      View postLine = ViewBindings.findChildViewById(rootView, id);
      if (postLine == null) {
        break missingId;
      }

      id = R.id.post_nickname;
      TextView postNickname = ViewBindings.findChildViewById(rootView, id);
      if (postNickname == null) {
        break missingId;
      }

      id = R.id.post_title;
      TextView postTitle = ViewBindings.findChildViewById(rootView, id);
      if (postTitle == null) {
        break missingId;
      }

      return new ItemPostlistBinding((ConstraintLayout) rootView, ConstraintLayoutAlready,
          imageView2, imgComment, musicIcon, postComment, postDate, postLikes, postLine,
          postNickname, postTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
