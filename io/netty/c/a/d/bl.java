/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.bi;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bm;
import io.netty.util.e;

public class bl
extends bi {
    private static final char a = '/';
    private static final char b = '?';
    private static final byte[] c = new byte[]{13, 10};

    @Override
    public boolean a(Object object) {
        return super.a(object) && !(object instanceof bm);
    }

    protected void a(g g2, bj bj2) {
        bj2.s().a(g2);
        g2.B(32);
        String string = bj2.t();
        if (string.length() == 0) {
            string = string + '/';
        } else {
            int n2 = string.indexOf("://");
            if (n2 != -1 && string.charAt(0) != '/') {
                int n3 = n2 + 3;
                int n4 = string.indexOf(63, n3);
                if (n4 == -1) {
                    if (string.lastIndexOf(47) <= n3) {
                        string = string + '/';
                    }
                } else if (string.lastIndexOf(47, n4) <= n3) {
                    int n5 = string.length();
                    StringBuilder stringBuilder = new StringBuilder(n5 + 1);
                    stringBuilder.append(string, 0, n4);
                    stringBuilder.append('/');
                    stringBuilder.append(string, n4, n5);
                    string = stringBuilder.toString();
                }
            }
        }
        g2.c(string.getBytes(e.d));
        g2.B(32);
        bj2.r().a(g2);
        g2.c(c);
    }
}

