/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.d.jl;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.n.a.ci;
import com.a.a.n.a.dl;
import com.a.a.n.a.fo;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Pattern;
import net.minecraft.client.b.a;
import net.minecraft.client.f.a.d;
import net.minecraft.client.f.am;
import net.minecraft.client.f.ao;
import net.minecraft.client.f.i;
import net.minecraft.client.f.k;
import net.minecraft.client.f.t;
import net.minecraft.client.f.x;
import net.minecraft.client.k.db;
import net.minecraft.client.r;
import org.apache.commons.b.a.f;
import org.apache.commons.b.b.w;
import org.apache.commons.b.o;
import org.apache.logging.log4j.c;

public class g {
    private static final org.apache.logging.log4j.d c = org.apache.logging.log4j.c.c();
    private static final FileFilter d = new x();
    private static final Pattern e = Pattern.compile("^[a-fA-F0-9]{40}$");
    private final File f;
    public final t a;
    private final File g;
    public final d b;
    private t h;
    private final ReentrantLock i = new ReentrantLock();
    private dl j;
    private List k = ov.a();
    private final List l = ov.a();

    public g(File file, File file2, t t2, d d2, a a2) {
        this.f = file;
        this.g = file2;
        this.a = t2;
        this.b = d2;
        this.j();
        this.b();
        Iterator iterator = a2.l.iterator();
        block0: while (iterator.hasNext()) {
            String string = (String)iterator.next();
            for (i i2 : this.k) {
                if (!i2.d().equals(string)) continue;
                if (i2.f() == 2 || a2.m.contains(i2.d())) {
                    this.l.add(i2);
                    continue block0;
                }
                iterator.remove();
                c.f("Removed selected resource pack {} because it's no longer compatible", i2.d());
            }
        }
    }

    public static Map a() {
        HashMap hashMap = sz.c();
        hashMap.put("X-Minecraft-Username", r.z().K().c());
        hashMap.put("X-Minecraft-UUID", r.z().K().b());
        hashMap.put("X-Minecraft-Version", "1.10 Multiplayer Fix");
        return hashMap;
    }

    private void j() {
        if (this.f.exists()) {
            if (!(this.f.isDirectory() || this.f.delete() && this.f.mkdirs())) {
                c.f("Unable to recreate resourcepack folder, it exists but is not a directory: {}", this.f);
            }
        } else if (!this.f.mkdirs()) {
            c.f("Unable to create resourcepack folder: {}", this.f);
        }
    }

    private List k() {
        return this.f.isDirectory() ? Arrays.asList(this.f.listFiles(d)) : Collections.emptyList();
    }

    public void b() {
        ArrayList arrayList = ov.a();
        for (Object object : this.k()) {
            i i2 = new i(this, (File)object, null);
            if (this.k.contains(i2)) {
                int n2 = this.k.indexOf(i2);
                if (n2 <= -1 || n2 >= this.k.size()) continue;
                arrayList.add((i)this.k.get(n2));
                continue;
            }
            try {
                i2.a();
                arrayList.add(i2);
            }
            catch (Exception exception) {
                arrayList.remove(i2);
            }
        }
        this.k.removeAll(arrayList);
        for (Object object : this.k) {
            ((i)object).b();
        }
        this.k = arrayList;
    }

    public i c() {
        if (this.h != null) {
            i i2 = new i(this, this.h, null);
            try {
                i2.a();
                return i2;
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return null;
    }

    public List d() {
        return jl.a(this.k);
    }

    public List e() {
        return jl.a(this.l);
    }

    public void a(List list) {
        this.l.clear();
        this.l.addAll(list);
    }

    public File f() {
        return this.f;
    }

    public dl a(String string, String string2) {
        String string3 = org.apache.commons.a.b.c.h(string);
        String string4 = e.matcher(string2).matches() ? string2 : "";
        File file = new File(this.g, string3);
        this.i.lock();
        try {
            dl dl2;
            this.h();
            if (file.exists()) {
                if (this.a(string4, file)) {
                    dl dl3;
                    dl dl4 = dl3 = this.a(file);
                    return dl4;
                }
                c.f("Deleting file {}", file);
                o.e(file);
            }
            this.l();
            db db2 = new db();
            Map map = net.minecraft.client.f.g.a();
            r r2 = r.z();
            ci.a((Future)r2.a(new k(this, r2, db2)));
            fo fo2 = fo.c();
            this.j = net.minecraft.u.ao.a(file, string, map, 0x3200000, db2, r2.M());
            ci.a(this.j, new ao(this, string4, file, fo2));
            dl dl5 = dl2 = this.j;
            return dl5;
        }
        finally {
            this.i.unlock();
        }
    }

    private boolean a(String string, File file) {
        String string2;
        block5: {
            block4: {
                string2 = org.apache.commons.a.b.c.g(new FileInputStream(file));
                if (!string.isEmpty()) break block4;
                c.d("Found file {} without verification hash", file);
                return true;
            }
            if (!string2.toLowerCase().equals(string.toLowerCase())) break block5;
            c.d("Found file {} matching requested hash {}", file, string);
            return true;
        }
        try {
            c.f("File {} had wrong hash (expected {}, found {}).", file, string, string2);
        }
        catch (IOException iOException) {
            c.f("File {} couldn't be hashed.", file, iOException);
        }
        return false;
    }

    private boolean b(File file) {
        i i2 = new i(this, new am(file), null);
        try {
            i2.a();
            return true;
        }
        catch (Exception exception) {
            c.f("Server resourcepack is invalid, ignoring it", (Throwable)exception);
            return false;
        }
    }

    private void l() {
        try {
            ArrayList arrayList = ov.a(o.a(this.g, w.a, null));
            Collections.sort(arrayList, org.apache.commons.b.a.f.b);
            int n2 = 0;
            for (File file : arrayList) {
                if (n2++ < 10) continue;
                c.d("Deleting old server resource pack {}", file.getName());
                o.e(file);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            c.b("Error while deleting old server resource pack : {}", illegalArgumentException.getMessage());
        }
    }

    public dl a(File file) {
        if (!this.b(file)) {
            return ci.a((Throwable)new RuntimeException("Invalid resourcepack"));
        }
        this.h = new am(file);
        return r.z().A();
    }

    public t g() {
        return this.h;
    }

    public void h() {
        this.i.lock();
        try {
            if (this.j != null) {
                this.j.cancel(true);
            }
            this.j = null;
            if (this.h != null) {
                this.h = null;
                r.z().A();
            }
        }
        finally {
            this.i.unlock();
        }
    }

    static /* synthetic */ boolean a(g g2, String string, File file) {
        return g2.a(string, file);
    }

    static /* synthetic */ org.apache.logging.log4j.d i() {
        return c;
    }
}

