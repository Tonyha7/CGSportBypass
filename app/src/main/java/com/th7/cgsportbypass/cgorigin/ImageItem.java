package com.th7.cgsportbypass.cgorigin;

package net.crigh.cgsport.camera.util;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.Serializable;
import org.apache.commons.lang.text.ExtendedMessageFormat;
import org.litepal.crud.LitePalSupport;

/* loaded from: C:\Users\tonyh\Desktop\platform-tools\fix\_data_user_de_0_net.crigh.cgsport_dsn0_dex_libdsn_2c04a533a4d58b848d6cc94cb3d2c83f.jar_classes3.dex_7019640.dex */
public class ImageItem extends LitePalSupport implements Serializable {
    public static final int ADD = 1;
    public static final int IMG = 2;
    public Bitmap bitmap;
    public int id;
    public String imageId;
    public String imagePath;
    public boolean isSelected;
    public boolean isTakePhoto;
    public String sportBean_id;
    public String thumbnailPath;
    public int type;

    public ImageItem() {
                this.isSelected = false;
        this.isTakePhoto = false;
    }

    public Bitmap getBitmap() {
                if (this.bitmap == null) {
            try {
                this.bitmap = C1047.m5471(this.imagePath);
            } catch (IOException unused) {
            }
        }
        return this.bitmap;
    }

    public int getId() {
                return this.id;
    }

    public String getImageId() {
                return this.imageId;
    }

    public String getImagePath() {
                return this.imagePath;
    }

    public String getSportBean_id() {
                return this.sportBean_id;
    }

    public String getThumbnailPath() {
                return this.thumbnailPath;
    }

    public boolean isSelected() {
                return this.isSelected;
    }

    public boolean isTakePhoto() {
                return this.isTakePhoto;
    }

    public void setBitmap(Bitmap bitmap) {
        if (this == null) {
            Ffd45ff93.access$0();
        }
        Exist.started();
        this.bitmap = bitmap;
    }

    public void setId(int i) {
        if (this == null) {
            Ffd45ff93.access$0();
        }
        Exist.started();
        this.id = i;
    }

    public void setImageId(String str) {
        if (this == null) {
            Ffd45ff93.access$0();
        }
        Exist.started();
        this.imageId = str;
    }

    public void setImagePath(String str) {
        if (this == null) {
            Ffd45ff93.access$0();
        }
        Exist.started();
        this.imagePath = str;
    }

    public void setSelected(boolean z) {
        if (this == null) {
            Ffd45ff93.access$0();
        }
        Exist.started();
        this.isSelected = z;
    }

    public void setSportBean_id(String str) {
        if (this == null) {
            Ffd45ff93.access$0();
        }
        Exist.started();
        this.sportBean_id = str;
    }

    public void setTakePhoto(boolean z) {
        if (this == null) {
            Ffd45ff93.access$0();
        }
        Exist.started();
        this.isTakePhoto = z;
    }

    public void setThumbnailPath(String str) {
        if (this == null) {
            Ffd45ff93.access$0();
        }
        Exist.started();
        this.thumbnailPath = str;
    }

    public String toString() {
                return "ImageItem{imageId='" + this.imageId + ExtendedMessageFormat.QUOTE + ", thumbnailPath='" + this.thumbnailPath + ExtendedMessageFormat.QUOTE + ", imagePath='" + this.imagePath + ExtendedMessageFormat.QUOTE + ", bitmap=" + this.bitmap + ", isSelected=" + this.isSelected + ExtendedMessageFormat.END_FE;
    }
}