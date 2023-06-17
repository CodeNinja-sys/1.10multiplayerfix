/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.c;

import com.sun.jna.at;
import com.sun.jna.bd;
import com.sun.jna.bi;

public class av
extends bd
implements bi {
    public int a;
    public int b;
    public int c;
    public int F;
    public at G;
    public int H;
    public byte[] I = new byte[32];

    public String toString() {
        return "XKeyboardStateByReference{key_click_percent=" + this.a + ", bell_percent=" + this.b + ", bell_pitch=" + this.c + ", bell_duration=" + this.F + ", led_mask=" + this.G + ", global_auto_repeat=" + this.H + ", auto_repeats=" + this.I + '}';
    }
}

