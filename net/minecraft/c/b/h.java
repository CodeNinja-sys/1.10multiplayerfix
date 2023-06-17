/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

import com.a.a.b.aj;
import com.a.a.d.nj;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.i.bi;
import com.a.b.aa;
import com.a.b.k;
import com.a.b.r;
import com.c.a.a;
import com.c.a.e;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import net.minecraft.c.b.ae;
import net.minecraft.c.b.f;
import net.minecraft.c.b.l;
import net.minecraft.c.b.m;
import net.minecraft.w.a.b;
import org.apache.commons.b.t;

public class h {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private static boolean c;
    private final Map d = sz.c();
    private final Map e = sz.c();
    private final Deque f = ov.b();
    private final com.c.a.f g;
    protected final k b;
    private final File h;
    private static final ParameterizedType i;

    static {
        i = new ae();
    }

    public h(com.c.a.f f2, File file) {
        this.g = f2;
        this.h = file;
        r r2 = new r();
        r2.a(f.class, (Object)new m(this, null));
        this.b = r2.i();
        this.b();
    }

    private static e a(com.c.a.f f2, String string) {
        e[] arre = new e[1];
        l l2 = new l(arre);
        f2.a(new String[]{string}, com.c.a.a.a, l2);
        if (!net.minecraft.c.b.h.d() && arre[0] == null) {
            UUID uUID = net.minecraft.w.a.b.a(new e(null, string));
            e e2 = new e(uUID, string);
            l2.a(e2);
        }
        return arre[0];
    }

    public static void a(boolean bl2) {
        c = bl2;
    }

    private static boolean d() {
        return c;
    }

    public void a(e e2) {
        this.a(e2, null);
    }

    private void a(e e2, Date date) {
        Object object;
        UUID uUID = e2.a();
        if (date == null) {
            object = Calendar.getInstance();
            ((Calendar)object).setTime(new Date());
            ((Calendar)object).add(2, 1);
            date = ((Calendar)object).getTime();
        }
        object = e2.b().toLowerCase(Locale.ROOT);
        f f2 = new f(this, e2, date, null);
        if (this.e.containsKey(uUID)) {
            f f3 = (f)this.e.get(uUID);
            this.d.remove(f3.a().b().toLowerCase(Locale.ROOT));
            this.f.remove(e2);
        }
        this.d.put(e2.b().toLowerCase(Locale.ROOT), f2);
        this.e.put(uUID, f2);
        this.f.addFirst(e2);
        this.c();
    }

    public e a(String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        f f2 = (f)this.d.get(string2);
        if (f2 != null && new Date().getTime() >= net.minecraft.c.b.f.a(f2).getTime()) {
            this.e.remove(f2.a().a());
            this.d.remove(f2.a().b().toLowerCase(Locale.ROOT));
            this.f.remove(f2.a());
            f2 = null;
        }
        if (f2 != null) {
            e e2 = f2.a();
            this.f.remove(e2);
            this.f.addFirst(e2);
        } else {
            e e3 = net.minecraft.c.b.h.a(this.g, string2);
            if (e3 != null) {
                this.a(e3);
                f2 = (f)this.d.get(string2);
            }
        }
        this.c();
        return f2 == null ? null : f2.a();
    }

    public String[] a() {
        ArrayList arrayList = ov.a(this.d.keySet());
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public e a(UUID uUID) {
        f f2 = (f)this.e.get(uUID);
        return f2 == null ? null : f2.a();
    }

    private f b(UUID uUID) {
        f f2 = (f)this.e.get(uUID);
        if (f2 != null) {
            e e2 = f2.a();
            this.f.remove(e2);
            this.f.addFirst(e2);
        }
        return f2;
    }

    /*
     * Loose catch block
     * Enabled aggressive exception aggregation
     */
    public void b() {
        block8: {
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = bi.a(this.h, aj.c);
                List list = (List)this.b.a((Reader)bufferedReader, (Type)i);
                this.d.clear();
                this.e.clear();
                this.f.clear();
                if (list != null) {
                    for (f f2 : ov.b(list)) {
                        if (f2 == null) continue;
                        this.a(f2.a(), f2.b());
                    }
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                t.a(bufferedReader);
                break block8;
            }
            catch (aa aa2) {
                t.a(bufferedReader);
                break block8;
                catch (Throwable throwable) {
                    t.a(bufferedReader);
                    throw throwable;
                }
            }
            t.a(bufferedReader);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void c() {
        String string = this.b.b(this.a(1000));
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = bi.b(this.h, aj.c);
            bufferedWriter.write(string);
        }
        catch (FileNotFoundException fileNotFoundException) {
            t.a(bufferedWriter);
            return;
            catch (IOException iOException) {
                t.a(bufferedWriter);
                return;
                catch (Throwable throwable) {
                    t.a(bufferedWriter);
                    throw throwable;
                }
            }
        }
        t.a(bufferedWriter);
        return;
    }

    private List a(int n2) {
        ArrayList arrayList = ov.a();
        for (e e2 : ov.a(nj.e(this.f.iterator(), n2))) {
            f f2 = this.b(e2.a());
            if (f2 == null) continue;
            arrayList.add(f2);
        }
        return arrayList;
    }
}

