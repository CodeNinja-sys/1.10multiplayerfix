/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.d.fo;
import com.ibm.icu.d.gk;
import com.ibm.icu.d.gm;
import java.io.IOException;

public final class dq
extends gm {
    public StringBuilder a(CharSequence charSequence, StringBuilder stringBuilder) {
        if (stringBuilder != charSequence) {
            stringBuilder.setLength(0);
            return stringBuilder.append(charSequence);
        }
        throw new IllegalArgumentException();
    }

    public Appendable a(CharSequence charSequence, Appendable appendable) {
        if (appendable != charSequence) {
            try {
                return appendable.append(charSequence);
            }
            catch (IOException iOException) {
                throw new RuntimeException(iOException);
            }
        }
        throw new IllegalArgumentException();
    }

    public StringBuilder a(StringBuilder stringBuilder, CharSequence charSequence) {
        if (stringBuilder != charSequence) {
            return stringBuilder.append(charSequence);
        }
        throw new IllegalArgumentException();
    }

    public StringBuilder b(StringBuilder stringBuilder, CharSequence charSequence) {
        if (stringBuilder != charSequence) {
            return stringBuilder.append(charSequence);
        }
        throw new IllegalArgumentException();
    }

    public String d_(int n2) {
        return null;
    }

    public boolean a(CharSequence charSequence) {
        return true;
    }

    public gk b(CharSequence charSequence) {
        return fo.q;
    }

    public int c(CharSequence charSequence) {
        return charSequence.length();
    }

    public boolean b(int n2) {
        return true;
    }

    public boolean c(int n2) {
        return true;
    }

    public boolean d(int n2) {
        return true;
    }
}

