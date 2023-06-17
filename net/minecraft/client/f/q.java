/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.b.aj;
import com.a.b.aa;
import com.a.b.ab;
import com.a.b.z;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import net.minecraft.client.f.a.a;
import net.minecraft.client.f.a.d;
import net.minecraft.client.f.t;
import net.minecraft.client.g.a.p;
import net.minecraft.u.bp;
import org.apache.logging.log4j.c;

public abstract class q
implements t {
    private static final org.apache.logging.log4j.d b = c.c();
    protected final File a;

    public q(File file) {
        this.a = file;
    }

    private static String c(bp bp2) {
        return String.format("%s/%s/%s", "assets", bp2.c(), bp2.b());
    }

    protected static String a(File file, File file2) {
        return file.toURI().relativize(file2.toURI()).getPath();
    }

    @Override
    public InputStream a(bp bp2) {
        return this.a(q.c(bp2));
    }

    @Override
    public boolean b(bp bp2) {
        return this.b(q.c(bp2));
    }

    protected abstract InputStream a(String var1);

    protected abstract boolean b(String var1);

    protected void c(String string) {
        b.f("ResourcePack: ignored non-lowercase namespace: %s in %s", string, this.a);
    }

    @Override
    public a a(d d2, String string) {
        return q.a(d2, this.a("pack.mcmeta"), string);
    }

    static a a(d d2, InputStream inputStream, String string) {
        z z2 = null;
        BufferedReader bufferedReader = null;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, aj.c));
                z2 = new ab().a(bufferedReader).t();
            }
            catch (RuntimeException runtimeException) {
                throw new aa(runtimeException);
            }
        }
        catch (Throwable throwable) {
            org.apache.commons.b.t.a(bufferedReader);
            throw throwable;
        }
        org.apache.commons.b.t.a(bufferedReader);
        return d2.a(string, z2);
    }

    @Override
    public BufferedImage b() {
        return p.a(this.a("pack.png"));
    }

    @Override
    public String c() {
        return this.a.getName();
    }
}

