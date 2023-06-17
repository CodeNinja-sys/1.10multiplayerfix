/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.InetAddress;
import org.apache.a.f.l;

public class aw
implements l {
    public static final aw a = new aw();

    public InetAddress[] a(String string) {
        return InetAddress.getAllByName(string);
    }
}

