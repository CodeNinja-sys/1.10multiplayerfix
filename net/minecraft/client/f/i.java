/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import java.awt.image.BufferedImage;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import net.minecraft.client.f.am;
import net.minecraft.client.f.b;
import net.minecraft.client.f.g;
import net.minecraft.client.f.t;
import net.minecraft.client.g.a.c;
import net.minecraft.client.g.a.m;
import net.minecraft.u.bp;
import net.minecraft.u.d.o;

public class i {
    private final t b;
    private net.minecraft.client.f.a.g c;
    private bp d;
    final /* synthetic */ g a;

    private i(g g2, File file) {
        this(g2, file.isDirectory() ? new b(file) : new am(file));
    }

    private i(g g2, t t2) {
        this.a = g2;
        this.b = t2;
    }

    public void a() {
        this.c = (net.minecraft.client.f.a.g)this.b.a(this.a.b, "pack");
        this.b();
    }

    public void a(c c2) {
        BufferedImage bufferedImage = null;
        try {
            bufferedImage = this.b.b();
        }
        catch (IOException iOException) {
            // empty catch block
        }
        if (bufferedImage == null) {
            try {
                bufferedImage = this.a.a.b();
            }
            catch (IOException iOException) {
                throw new Error("Couldn't bind resource pack icon", iOException);
            }
        }
        if (this.d == null) {
            this.d = c2.a("texturepackicon", new m(bufferedImage));
        }
        c2.a(this.d);
    }

    public void b() {
        if (this.b instanceof Closeable) {
            org.apache.commons.b.t.a((Closeable)((Object)this.b));
        }
    }

    public t c() {
        return this.b;
    }

    public String d() {
        return this.b.c();
    }

    public String e() {
        return this.c == null ? (Object)((Object)o.m) + "Invalid pack.mcmeta (or missing 'pack' section)" : this.c.a().d();
    }

    public int f() {
        return this.c == null ? 0 : this.c.b();
    }

    public boolean equals(Object object) {
        return this == object ? true : (object instanceof i ? this.toString().equals(object.toString()) : false);
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return String.format("%s:%s", this.b.c(), this.b instanceof b ? "folder" : "zip");
    }

    /* synthetic */ i(g g2, File file, i i2) {
        this(g2, file);
    }

    /* synthetic */ i(g g2, t t2, i i2) {
        this(g2, t2);
    }
}

