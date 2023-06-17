/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import java.util.Random;

final class do {
    static final Random a = new Random();
    int b;

    do() {
        int n2 = a.nextInt();
        this.b = n2 == 0 ? 1 : n2;
    }
}

