/*
 * Decompiled with CFR 0.150.
 */
package net.java.games.input;

import java.io.File;
import java.util.Comparator;
import net.java.games.input.bm;

class bn
implements Comparator {
    private final bm a;

    bn(bm bm2) {
        this.a = bm2;
    }

    public int compare(Object object, Object object2) {
        return ((File)object).getName().compareTo(((File)object2).getName());
    }
}

