/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.b.e;

import java.io.Serializable;
import java.io.Writer;

public class n
extends Writer
implements Serializable {
    private final StringBuilder a;

    public n() {
        this.a = new StringBuilder();
    }

    public n(int n2) {
        this.a = new StringBuilder(n2);
    }

    public n(StringBuilder stringBuilder) {
        this.a = stringBuilder != null ? stringBuilder : new StringBuilder();
    }

    @Override
    public Writer append(char c2) {
        this.a.append(c2);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    @Override
    public Writer append(CharSequence charSequence, int n2, int n3) {
        this.a.append(charSequence, n2, n3);
        return this;
    }

    @Override
    public void close() {
    }

    @Override
    public void flush() {
    }

    @Override
    public void write(String string) {
        if (string != null) {
            this.a.append(string);
        }
    }

    @Override
    public void write(char[] arrc, int n2, int n3) {
        if (arrc != null) {
            this.a.append(arrc, n2, n3);
        }
    }

    public StringBuilder a() {
        return this.a;
    }

    public String toString() {
        return this.a.toString();
    }
}

