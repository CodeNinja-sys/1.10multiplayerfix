/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.e;

import com.a.a.d.ov;
import java.util.List;
import org.apache.commons.c.am;

public class d {
    private String a;
    private final List b = ov.a();

    private d() {
    }

    private void a(String string) {
        this.b.add(0, string);
    }

    public String a() {
        return am.a((Iterable)this.b, "->");
    }

    public String toString() {
        return this.a != null ? (this.b.isEmpty() ? this.a : String.valueOf(this.a) + " " + this.a()) : (this.b.isEmpty() ? "(Unknown file)" : "(Unknown file) " + this.a());
    }

    /* synthetic */ d(d d2) {
        this();
    }

    static /* synthetic */ void a(d d2, String string) {
        d2.a(string);
    }

    static /* synthetic */ void b(d d2, String string) {
        d2.a = string;
    }
}

