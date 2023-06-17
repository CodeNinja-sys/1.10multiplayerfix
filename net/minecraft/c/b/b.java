/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.c.b;

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
import net.minecraft.c.b.aa;
import net.minecraft.c.b.s;
import net.minecraft.c.b.v;
import org.apache.commons.b.t;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class b {
    protected static final d a = org.apache.logging.log4j.c.c();
    protected final k b;
    private final File c;
    private final Map d = sz.c();
    private boolean e = true;
    private static final ParameterizedType f = new v();

    public b(File file) {
        this.c = file;
        r r2 = new r().f();
        r2.a(aa.class, (Object)new s(this, null));
        this.b = r2.i();
    }

    public boolean a() {
        return this.e;
    }

    public void a(boolean bl2) {
        this.e = bl2;
    }

    public void a(aa aa2) {
        this.d.put(this.c(aa2.c()), aa2);
        try {
            this.d();
        }
        catch (IOException iOException) {
            a.f("Could not save the list after adding a user.", (Throwable)iOException);
        }
    }

    public aa a(Object object) {
        this.e();
        return (aa)this.d.get(this.c(object));
    }

    public void b(Object object) {
        this.d.remove(this.c(object));
        try {
            this.d();
        }
        catch (IOException iOException) {
            a.f("Could not save the list after removing a user.", (Throwable)iOException);
        }
    }

    public String[] b() {
        return this.d.keySet().toArray(new String[this.d.size()]);
    }

    protected String c(Object object) {
        return object.toString();
    }

    protected boolean d(Object object) {
        return this.d.containsKey(this.c(object));
    }

    private void e() {
        ArrayList arrayList = ov.a();
        for (Object object : this.d.values()) {
            if (!((aa)object).d()) continue;
            arrayList.add(((aa)object).c());
        }
        for (Object object : arrayList) {
            this.d.remove(object);
        }
    }

    protected aa a(z z2) {
        return new aa(null, z2);
    }

    protected Map c() {
        return this.d;
    }

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

