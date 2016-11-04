package model;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

/**
 * Created by Rizki Putra Bahari on 04/11/2016.
 */

public class Hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public Hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }

    public Hotel(ArrayList<Hotel> mList) {
    }
}
