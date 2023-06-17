/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import java.text.CharacterIterator;

abstract class dt {
    dt() {
    }

    public abstract int a(CharacterIterator var1, int var2, int[] var3, int[] var4, int var5, int[] var6);

    public int a(CharacterIterator characterIterator, int n2, int[] arrn, int[] arrn2, int n3) {
        return this.a(characterIterator, n2, arrn, arrn2, n3, null);
    }

    public abstract int a();
}

