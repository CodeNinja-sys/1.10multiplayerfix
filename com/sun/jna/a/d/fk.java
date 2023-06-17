/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.d;

import com.sun.jna.bd;
import java.awt.Rectangle;

public class fk
extends bd {
    public int a;
    public int b;
    public int c;
    public int F;

    public Rectangle s() {
        return new Rectangle(this.a, this.b, this.c - this.a, this.F - this.b);
    }

    public String toString() {
        return "[(" + this.a + "," + this.b + ")(" + this.c + "," + this.F + ")]";
    }
}

