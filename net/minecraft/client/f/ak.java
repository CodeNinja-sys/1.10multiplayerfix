/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.d.lo;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Set;
import net.minecraft.client.f.a.a;
import net.minecraft.client.f.a.d;
import net.minecraft.client.f.q;
import net.minecraft.client.f.t;
import net.minecraft.client.g.a.p;
import net.minecraft.u.bp;

public class ak
implements t {
    public static final Set a = lo.b("minecraft", (Object)"realms");
    private final net.minecraft.client.f.d b;

    public ak(net.minecraft.client.f.d d2) {
        this.b = d2;
    }

    @Override
    public InputStream a(bp bp2) {
        InputStream inputStream = this.d(bp2);
        if (inputStream != null) {
            return inputStream;
        }
        InputStream inputStream2 = this.c(bp2);
        if (inputStream2 != null) {
            return inputStream2;
        }
        throw new FileNotFoundException(bp2.b());
    }

    public InputStream c(bp bp2) {
        File file = this.b.a(bp2);
        return file != null && file.isFile() ? new FileInputStream(file) : null;
    }

    private InputStream d(bp bp2) {
        return ak.class.getResourceAsStream("/assets/" + bp2.c() + "/" + bp2.b());
    }

    @Override
    public boolean b(bp bp2) {
        return this.d(bp2) != null || this.b.b(bp2);
    }

    @Override
    public Set a() {
        return a;
    }

    @Override
    public a a(d d2, String string) {
        try {
            FileInputStream fileInputStream = new FileInputStream(this.b.a());
            return q.a(d2, fileInputStream, string);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
        catch (FileNotFoundException fileNotFoundException) {
            return null;
        }
    }

    @Override
    public BufferedImage b() {
        return p.a(ak.class.getResourceAsStream("/" + new bp("pack.png").b()));
    }

    @Override
    public String c() {
        return "Default";
    }
}

