/*
 * Decompiled with CFR 0.150.
 */
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
import org.apache.commons.b.a.f;
import org.apache.commons.b.b.w;
import org.apache.commons.b.o;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class hh {
    private static final d c = org.apache.logging.log4j.c.c();
    private static final FileFilter d = new bdc();
    private static final Pattern e = Pattern.compile("^[a-fA-F0-9]{40}$");
    private final File f;
    public final dav a;
    private final File g;
    public final a b;
    private dav h;
    private final ReentrantLock i = new ReentrantLock();
    private dl j;
    private List k = ov.a();
    private final List l = ov.a();

    public hh(File file, File file2, dav dav2, a a2, cmx cmx2) {
        this.f = file;
        this.g = file2;
        this.a = dav2;
        this.b = a2;
        this.j();
        this.b();
        Iterator iterator = cmx2.l.iterator();
        block0: while (iterator.hasNext()) {
            String string = (String)iterator.next();
            for (cdg cdg2 : this.k) {
                if (!cdg2.d().equals(string)) continue;
                if (cdg2.f() == 2 || cmx2.m.contains(cdg2.d())) {
                    this.l.add(cdg2);
                    continue block0;
                }
                iterator.remove();
                c.f("Removed selected resource pack {} because it's no longer compatible", cdg2.d());
            }
        }
    }

    public static Map a() {
        HashMap hashMap = sz.c();
        hashMap.put("X-Minecraft-Username", bxy.B().M().c());
        hashMap.put("X-Minecraft-UUID", bxy.B().M().b());
        hashMap.put("X-Minecraft-Version", "1.10");
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
        if (this.f.isDirectory()) {
            return Arrays.asList(this.f.listFiles(d));
        }
        return Collections.emptyList();
    }

    public void b() {
        ArrayList arrayList = ov.a();
        for (Object object : this.k()) {
            cdg cdg2 = new cdg(this, (File)object, null);
            if (this.k.contains(cdg2)) {
                int n2 = this.k.indexOf(cdg2);
                if (n2 <= -1 || n2 >= this.k.size()) continue;
                arrayList.add(this.k.get(n2));
                continue;
            }
            try {
                cdg2.a();
                arrayList.add(cdg2);
            }
            catch (Exception exception) {
                arrayList.remove(cdg2);
            }
        }
        this.k.removeAll(arrayList);
        for (Object object : this.k) {
            ((cdg)object).b();
        }
        this.k = arrayList;
    }

    public cdg c() {
        if (this.h != null) {
            cdg cdg2 = new cdg(this, this.h, null);
            try {
                cdg2.a();
                return cdg2;
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

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public dl a(String string, String string2) {
        String string3 = org.apache.commons.a.b.c.h(string);
        String string4 = e.matcher(string2).matches() ? string2 : "";
        File file = new File(this.g, string3);
        this.i.lock();
        try {
            this.h();
            if (file.exists()) {
                if (this.a(string4, file)) {
                    dl dl2 = this.a(file);
                    return dl2;
                }
                c.f("Deleting file {}", file);
                o.e(file);
            }
            this.l();
            cil cil2 = new cil();
            Map map = hh.a();
            bxy bxy2 = bxy.B();
            ci.a((Future)bxy2.a(new ash(this, bxy2, cil2)));
            fo fo2 = fo.c();
            this.j = aix.a(file, string, map, 0x3200000, cil2, bxy2.O());
            ci.a(this.j, new ccr(this, string4, file, fo2));
            dl dl3 = this.j;
            return dl3;
        }
        finally {
            this.i.unlock();
        }
    }

    private boolean a(String string, File file) {
        try {
            String string2 = org.apache.commons.a.b.c.g(new FileInputStream(file));
            if (string.isEmpty()) {
                c.d("Found file {} without verification hash", file);
                return true;
            }
            if (string2.toLowerCase().equals(string.toLowerCase())) {
                c.d("Found file {} matching requested hash {}", file, string);
                return true;
            }
            c.f("File {} had wrong hash (expected {}, found {}).", file, string, string2);
        }
        catch (IOException iOException) {
            c.f("File {} couldn't be hashed.", file, iOException);
        }
        return false;
    }

    private boolean b(File file) {
        cdg cdg2 = new cdg(this, new alm(file), null);
        try {
            cdg2.a();
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
        this.h = new alm(file);
        return bxy.B().C();
    }

    public dav g() {
        return this.h;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void h() {
        this.i.lock();
        try {
            if (this.j != null) {
                this.j.cancel(true);
            }
            this.j = null;
            if (this.h != null) {
                this.h = null;
                bxy.B().C();
            }
        }
        finally {
            this.i.unlock();
        }
    }

    static /* synthetic */ boolean a(hh hh2, String string, File file) {
        return hh2.a(string, file);
    }

    static /* synthetic */ d i() {
        return c;
    }
}

