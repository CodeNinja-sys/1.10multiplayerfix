/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

class t
implements CharSequence {
    final CharSequence a;

    t(CharSequence charSequence) {
        this.a = charSequence;
    }

    @Override
    public int length() {
        return this.a.length() + 1;
    }

    @Override
    public char charAt(int n2) {
        return n2 == this.a.length() ? (char)'\u0000' : this.a.charAt(n2);
    }

    @Override
    public CharSequence subSequence(int n2, int n3) {
        return new t(this.a.subSequence(n2, Math.min(n3, this.a.length())));
    }
}

