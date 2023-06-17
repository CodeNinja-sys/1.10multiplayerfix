/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.compress.archivers.h.am;
import org.apache.commons.compress.archivers.h.an;
import org.apache.commons.compress.archivers.h.n;

class m
implements am {
    private final char[] a;
    private final List b;

    public m(char[] arrc) {
        this.a = (char[])arrc.clone();
        ArrayList<n> arrayList = new ArrayList<n>(this.a.length);
        byte by2 = 127;
        for (char c2 : this.a) {
            by2 = (byte)(by2 + 1);
            arrayList.add(new n(by2, c2));
        }
        Collections.sort(arrayList);
        this.b = Collections.unmodifiableList(arrayList);
    }

    public char a(byte by2) {
        if (by2 >= 0) {
            return (char)by2;
        }
        return this.a[128 + by2];
    }

    public boolean a(char c2) {
        if (c2 >= '\u0000' && c2 < '\u0080') {
            return true;
        }
        n n2 = this.b(c2);
        return n2 != null;
    }

    public boolean a(ByteBuffer byteBuffer, char c2) {
        if (c2 >= '\u0000' && c2 < '\u0080') {
            byteBuffer.put((byte)c2);
            return true;
        }
        n n2 = this.b(c2);
        if (n2 == null) {
            return false;
        }
        byteBuffer.put(n2.b);
        return true;
    }

    private n b(char c2) {
        int n2 = 0;
        int n3 = this.b.size();
        while (n3 > n2) {
            int n4 = n2 + (n3 - n2) / 2;
            n n5 = (n)this.b.get(n4);
            if (n5.a == c2) {
                return n5;
            }
            if (n5.a < c2) {
                n2 = n4 + 1;
                continue;
            }
            n3 = n4;
        }
        if (n2 >= this.b.size()) {
            return null;
        }
        n n6 = (n)this.b.get(n2);
        if (n6.a != c2) {
            return null;
        }
        return n6;
    }

    public boolean a(String string) {
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (this.a(c2)) continue;
            return false;
        }
        return true;
    }

    public ByteBuffer b(String string) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(string.length() + 6 + (string.length() + 1) / 2);
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (byteBuffer.remaining() < 6) {
                byteBuffer = an.a(byteBuffer, byteBuffer.position() + 6);
            }
            if (this.a(byteBuffer, c2)) continue;
            an.a(byteBuffer, c2);
        }
        byteBuffer.limit(byteBuffer.position());
        byteBuffer.rewind();
        return byteBuffer;
    }

    public String a(byte[] arrby) {
        char[] arrc = new char[arrby.length];
        for (int i2 = 0; i2 < arrby.length; ++i2) {
            arrc[i2] = this.a(arrby[i2]);
        }
        return new String(arrc);
    }
}

