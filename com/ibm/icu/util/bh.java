/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.bg;
import com.ibm.icu.util.bi;
import com.ibm.icu.util.co;

public class bh
extends bi {
    private static final bg y = new bg();
    public static bh a = new bh(0, 1, 2, "Rosh Hashanah");
    public static bh b = new bh(0, 3, "Fast of Gedaliah");
    public static bh c = new bh(0, 10, "Yom Kippur");
    public static bh d = new bh(0, 15, 6, "Sukkot");
    public static bh e = new bh(0, 21, "Hoshanah Rabbah");
    public static bh f = new bh(0, 22, "Shemini Atzeret");
    public static bh g = new bh(0, 23, "Simchat Torah");
    public static bh h = new bh(2, 25, "Hanukkah");
    public static bh i = new bh(3, 10, "Fast of Tevet 10");
    public static bh j = new bh(4, 15, "Tu B'Shevat");
    public static bh k = new bh(6, 13, "Fast of Esther");
    public static bh l = new bh(6, 14, "Purim");
    public static bh m = new bh(6, 15, "Shushan Purim");
    public static bh n = new bh(7, 15, 8, "Passover");
    public static bh o = new bh(7, 27, "Yom Hashoah");
    public static bh p = new bh(8, 4, "Yom Hazikaron");
    public static bh q = new bh(8, 5, "Yom Ha'Atzmaut");
    public static bh r = new bh(8, 14, "Pesach Sheini");
    public static bh s = new bh(8, 18, "Lab B'Omer");
    public static bh t = new bh(8, 28, "Yom Yerushalayim");
    public static bh u = new bh(9, 6, 2, "Shavuot");
    public static bh v = new bh(10, 17, "Fast of Tammuz 17");
    public static bh w = new bh(11, 9, "Fast of Tisha B'Av");
    public static bh x = new bh(12, 21, "Selihot");

    public bh(int n2, int n3, String string) {
        this(n2, n3, 1, string);
    }

    public bh(int n2, int n3, int n4, String string) {
        super(string, new co(n2, n3, y));
    }
}

