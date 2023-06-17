/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.c;

import io.netty.channel.an;
import java.net.SocketAddress;

public final class a
extends SocketAddress
implements Comparable {
    private static final long b = 4644331421130916435L;
    public static final a a = new a("ANY");
    private final String c;
    private final String d;

    a(an an2) {
        StringBuilder stringBuilder = new StringBuilder(16);
        stringBuilder.append("local:E");
        stringBuilder.append(Long.toHexString((long)an2.hashCode() & 0xFFFFFFFFL | 0x100000000L));
        stringBuilder.setCharAt(7, ':');
        this.c = stringBuilder.substring(6);
        this.d = stringBuilder.toString();
    }

    public a(String string) {
        if (string == null) {
            throw new NullPointerException("id");
        }
        if ((string = string.trim().toLowerCase()).isEmpty()) {
            throw new IllegalArgumentException("empty id");
        }
        this.c = string;
        this.d = "local:" + string;
    }

    public String a() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        return this.c.equals(((a)object).c);
    }

    public int a(a a2) {
        return this.c.compareTo(a2.c);
    }

    public String toString() {
        return this.d;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((a)object);
    }
}

