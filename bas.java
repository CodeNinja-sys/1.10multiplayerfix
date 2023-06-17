/*
 * Decompiled with CFR 0.150.
 */
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
import com.c.a.f;
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
import org.apache.commons.b.t;

public class bas {
    public static final SimpleDateFormat a = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");
    private static boolean c;
    private final Map d = sz.c();
    private final Map e = sz.c();
    private final Deque f = ov.b();
    private final f g;
    protected final k b;
    private final File h;
    private static final ParameterizedType i;

    public bas(f f2, File file) {
        this.g = f2;
        this.h = file;
        r r2 = new r();
        r2.a(blr.class, (Object)new clm(this, null));
        this.b = r2.i();
        this.b();
    }

    private static e a(f f2, String string) {
        e[] arre = new e[1];
        cdd cdd2 = new cdd(arre);
        f2.a(new String[]{string}, com.c.a.a.a, cdd2);
        if (!bas.d() && arre[0] == null) {
            UUID uUID = bdl.a(new e(null, string));
            e e2 = new e(uUID, string);
            cdd2.a(e2);
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
        blr blr2 = new blr(this, e2, date, null);
        if (this.e.containsKey(uUID)) {
            blr blr3 = (blr)this.e.get(uUID);
            this.d.remove(blr3.a().b().toLowerCase(Locale.ROOT));
            this.f.remove(e2);
        }
        this.d.put(e2.b().toLowerCase(Locale.ROOT), blr2);
        this.e.put(uUID, blr2);
        this.f.addFirst(e2);
        this.c();
    }

    public e a(String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        blr blr2 = (blr)this.d.get(string2);
        if (blr2 != null && new Date().getTime() >= blr.a(blr2).getTime()) {
            this.e.remove(blr2.a().a());
            this.d.remove(blr2.a().b().toLowerCase(Locale.ROOT));
            this.f.remove(blr2.a());
            blr2 = null;
        }
        if (blr2 != null) {
            e e2 = blr2.a();
            this.f.remove(e2);
            this.f.addFirst(e2);
        } else {
            e e3 = bas.a(this.g, string2);
            if (e3 != null) {
                this.a(e3);
                blr2 = (blr)this.d.get(string2);
            }
        }
        this.c();
        return blr2 == null ? null : blr2.a();
    }

    public String[] a() {
        ArrayList arrayList = ov.a(this.d.keySet());
        return arrayList.toArray(new String[arrayList.size()]);
    }

    public e a(UUID uUID) {
        blr blr2 = (blr)this.e.get(uUID);
        return blr2 == null ? null : blr2.a();
    }

    private blr b(UUID uUID) {
        blr blr2 = (blr)this.e.get(uUID);
        if (blr2 != null) {
            e e2 = blr2.a();
            this.f.remove(e2);
            this.f.addFirst(e2);
        }
        return blr2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void b() {
        BufferedReader bufferedReader;
        block7: {
            bufferedReader = null;
            try {
                bufferedReader = bi.a(this.h, aj.c);
                List list = (List)this.b.a((Reader)bufferedReader, (Type)i);
                this.d.clear();
                this.e.clear();
                this.f.clear();
                if (list == null) break block7;
                for (blr blr2 : ov.b(list)) {
                    if (blr2 == null) continue;
                    this.a(blr2.a(), blr2.b());
                }
            }
            catch (FileNotFoundException fileNotFoundException) {
                t.a(bufferedReader);
                return;
                catch (aa aa2) {
                    t.a(bufferedReader);
                    return;
                    catch (Throwable throwable) {
                        t.a(bufferedReader);
                        throw throwable;
                    }
                }
            }
        }
        t.a(bufferedReader);
        return;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
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
        ArrayList arrayList2 = ov.a(nj.e(this.f.iterator(), n2));
        for (e e2 : arrayList2) {
            blr blr2 = this.b(e2.a());
            if (blr2 == null) continue;
            arrayList.add(blr2);
        }
        return arrayList;
    }

    static {
        i = new kk();
    }
}

