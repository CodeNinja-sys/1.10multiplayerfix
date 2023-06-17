/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.dt;
import java.text.CharacterIterator;

class ka {
    private static final int a = 20;
    private int[] b = new int[20];
    private int[] c = new int[1];
    private int d;
    private int e = -1;
    private int f;
    private int g;

    public int a(CharacterIterator characterIterator, dt dt2, int n2) {
        int n3 = characterIterator.getIndex();
        if (n3 != this.e) {
            this.e = n3;
            this.d = dt2.a(characterIterator, n2 - n3, this.b, this.c, this.b.length);
            if (this.c[0] <= 0) {
                characterIterator.setIndex(n3);
            }
        }
        if (this.c[0] > 0) {
            characterIterator.setIndex(n3 + this.b[this.c[0] - 1]);
        }
        this.f = this.g = this.c[0] - 1;
        return this.c[0];
    }

    public int a(CharacterIterator characterIterator) {
        characterIterator.setIndex(this.e + this.b[this.f]);
        return this.b[this.f];
    }

    public boolean b(CharacterIterator characterIterator) {
        if (this.g > 0) {
            characterIterator.setIndex(this.e + this.b[--this.g]);
            return true;
        }
        return false;
    }

    public int a() {
        return this.d;
    }

    public void b() {
        this.f = this.g;
    }
}

