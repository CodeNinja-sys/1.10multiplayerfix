/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.a.d.gf;
import com.sun.jna.ay;
import com.sun.jna.bd;
import com.sun.jna.bw;

public class cn
extends bd {
    public gf a;
    public int b;
    public bw c;
    public bw F;
    public short G;
    public boolean H;
    public ay I;
    public bw J;

    public String b(String[] arrstring) {
        String string = "";
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            string = string + arrstring[i2];
            string = string + "\u0000";
        }
        return string + "\u0000";
    }
}

