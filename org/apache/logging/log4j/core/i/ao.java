/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.i;

class ao {
    private final int a;
    private final char b;

    public ao(int n2, char c2) {
        this.a = n2;
        this.b = c2;
    }

    public int a(StringBuilder stringBuilder, int n2) {
        int n3 = stringBuilder.toString().indexOf(46, n2);
        if (n3 != -1) {
            if (n3 - n2 > this.a) {
                stringBuilder.delete(n2 + this.a, n3);
                n3 = n2 + this.a;
                if (this.b != '\u0000') {
                    stringBuilder.insert(n3, this.b);
                    ++n3;
                }
            }
            ++n3;
        }
        return n3;
    }
}

