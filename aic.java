/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.aj;
import com.a.a.d.ov;
import com.a.a.d.sz;
import com.a.a.i.bi;
import com.a.b.k;
import com.a.b.r;
import com.a.b.z;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class aic {
    protected static final d a = org.apache.logging.log4j.c.c();
    protected final k b;
    private final File c;
    private final Map d = sz.c();
    private boolean e = true;
    private static final ParameterizedType f = new bfk();

    public aic(File file) {
        this.c = file;
        r r2 = new r().f();
        r2.a(bhk.class, (Object)new cug(this, null));
        this.b = r2.i();
    }

    public boolean b() {
        return this.e;
    }

    public void a(boolean bl2) {
        this.e = bl2;
    }

    public void a(bhk bhk2) {
        this.d.put(this.a(bhk2.a()), bhk2);
        try {
            this.d();
        }
        catch (IOException iOException) {
            a.f("Could not save the list after adding a user.", (Throwable)iOException);
        }
    }

    public bhk b(Object object) {
        this.e();
        return (bhk)this.d.get(this.a(object));
    }

    public void c(Object object) {
        this.d.remove(this.a(object));
        try {
            this.d();
        }
        catch (IOException iOException) {
            a.f("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    public String[] a() {
        return this.d.keySet().toArray(new String[this.d.size()]);
    }

    protected String a(Object object) {
        return object.toString();
    }

    protected boolean d(Object object) {
        return this.d.containsKey(this.a(object));
    }

    private void e() {
        ArrayList arrayList = ov.a();
        for (Object object : this.d.values()) {
            if (!((bhk)object).b()) continue;
            arrayList.add(((bhk)object).a());
        }
        for (Object object : arrayList) {
            this.d.remove(object);
        }
    }

    protected bhk a(z z2) {
        return new bhk(null, z2);
    }

    protected Map c() {
        return this.d;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void d() {
        Collection collection = this.d.values();
        String string = this.b.b(collection);
        BufferedWriter bufferedWriter = null;
        try {
            bufferedWriter = bi.b(this.c, aj.c);
            bufferedWriter.write(string);
        }
        catch (Throwable throwable) {
            t.a(bufferedWriter);
            throw throwable;
        }
        t.a(bufferedWriter);
    }
}

