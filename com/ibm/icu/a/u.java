/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.d.kx;
import java.text.CharacterIterator;

public final class u {
    public static final int a = Integer.MAX_VALUE;

    private u() {
    }

    public static int a(CharacterIterator characterIterator) {
        int n2 = characterIterator.current();
        if (n2 >= 55296 && n2 <= 56319 && ((n2 = characterIterator.next()) < 56320 || n2 > 57343)) {
            n2 = characterIterator.previous();
        }
        if ((n2 = characterIterator.next()) >= 55296) {
            n2 = u.a(characterIterator, n2);
        }
        if (n2 >= 65536 && n2 != Integer.MAX_VALUE) {
            characterIterator.previous();
        }
        return n2;
    }

    public static int a(CharacterIterator characterIterator, int n2) {
        if (n2 == 65535 && characterIterator.getIndex() >= characterIterator.getEndIndex()) {
            return Integer.MAX_VALUE;
        }
        int n3 = n2;
        if (n2 <= 56319) {
            char c2 = characterIterator.next();
            if (kx.b(c2)) {
                n3 = (n2 - 55296 << 10) + (c2 - 56320) + 65536;
            } else {
                characterIterator.previous();
            }
        }
        return n3;
    }

    public static int b(CharacterIterator characterIterator) {
        int n2;
        if (characterIterator.getIndex() <= characterIterator.getBeginIndex()) {
            return Integer.MAX_VALUE;
        }
        int n3 = n2 = characterIterator.previous();
        if (kx.b((char)n2) && characterIterator.getIndex() > characterIterator.getBeginIndex()) {
            char c2 = characterIterator.previous();
            if (kx.c(c2)) {
                n3 = (c2 - 55296 << 10) + (n2 - 56320) + 65536;
            } else {
                characterIterator.next();
            }
        }
        return n3;
    }

    public static int c(CharacterIterator characterIterator) {
        int n2 = characterIterator.current();
        int n3 = n2;
        if (n3 < 55296) {
            return n3;
        }
        if (kx.c((char)n2)) {
            char c2 = characterIterator.next();
            characterIterator.previous();
            if (kx.b(c2)) {
                n3 = (n2 - 55296 << 10) + (c2 - 56320) + 65536;
            }
        } else if (n2 == 65535 && characterIterator.getIndex() >= characterIterator.getEndIndex()) {
            n3 = Integer.MAX_VALUE;
        }
        return n3;
    }
}

