/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.FromNativeConverter;
import com.sun.jna.Native;
import com.sun.jna.ToNativeConverter;
import com.sun.jna.ac;
import com.sun.jna.av;
import com.sun.jna.aw;
import com.sun.jna.ax;
import com.sun.jna.ay;
import com.sun.jna.be;
import com.sun.jna.bf;
import com.sun.jna.bh;
import com.sun.jna.bi;
import com.sun.jna.bj;
import com.sun.jna.bk;
import com.sun.jna.bn;
import com.sun.jna.bo;
import com.sun.jna.bp;
import com.sun.jna.bq;
import com.sun.jna.br;
import com.sun.jna.bs;
import com.sun.jna.bu;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.zip.Adler32;

public abstract class bd {
    private static final boolean a;
    private static final boolean b;
    static final boolean d;
    static final boolean e;
    static final boolean f;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    static final int k;
    protected static final int l = -1;
    static final Map m;
    private ay c;
    private int F = -1;
    private int G;
    private int H;
    private Map I;
    private final Map J = new HashMap();
    private bu K;
    private long L;
    private List M;
    private boolean N = true;
    private boolean O = true;
    private bd[] P;
    private static final ThreadLocal Q;
    private static final ThreadLocal R;
    static Class n;
    static Class o;
    static Class p;
    static Class q;
    static Class r;
    static Class s;
    static Class t;
    static Class u;
    static Class v;
    static Class w;
    static Class x;
    static Class y;
    static Class z;
    static Class A;
    static Class B;
    static Class C;
    static Class D;
    static Class E;

    protected bd() {
        this((ay)null);
    }

    protected bd(bu bu2) {
        this(null, 0, bu2);
    }

    protected bd(ay ay2) {
        this(ay2, 0);
    }

    protected bd(ay ay2, int n2) {
        this(ay2, n2, null);
    }

    protected bd(ay ay2, int n2, bu bu2) {
        this.a(n2);
        this.a(bu2);
        if (ay2 != null) {
            this.a(ay2);
        } else {
            this.c(-1);
        }
    }

    Map a() {
        return this.I;
    }

    bu b() {
        return this.K;
    }

    protected void a(bu bu2) {
        Class<?> class_;
        if (bu2 == null && (class_ = this.getClass().getDeclaringClass()) != null) {
            bu2 = Native.d(class_);
        }
        this.K = bu2;
        this.F = -1;
        if (this.c instanceof bh) {
            this.c = null;
        }
    }

    protected void a(int n2) {
        if (n2 == 0) {
            Class<?> class_ = this.getClass().getDeclaringClass();
            if (class_ != null) {
                n2 = Native.e(class_);
            }
            if (n2 == 0) {
                n2 = ax.e() ? 3 : 2;
            }
        }
        this.G = n2;
        this.F = -1;
        if (this.c instanceof bh) {
            this.c = null;
        }
    }

    protected ac b(int n2) {
        return new bh(this, n2);
    }

    protected void a(ay ay2) {
        this.a(ay2, 0);
    }

    protected void a(ay ay2, int n2) {
        try {
            this.c = ay2.a(n2);
            if (this.F == -1) {
                this.F = this.h(false);
            }
            if (this.F != -1) {
                this.c = ay2.a((long)n2, (long)this.F);
            }
            this.P = null;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new IllegalArgumentException("Structure exceeds provided memory bounds");
        }
    }

    protected void c() {
        this.f(false);
    }

    private void f(boolean bl2) {
        if (this.c == null) {
            this.g(bl2);
        } else if (this.F == -1) {
            this.F = this.a(true, bl2);
        }
    }

    protected void d() {
        this.g(false);
    }

    private void g(boolean bl2) {
        this.c(this.a(true, bl2));
    }

    protected void c(int n2) {
        if (n2 == -1) {
            n2 = this.h(false);
        } else if (n2 <= 0) {
            throw new IllegalArgumentException("Structure size must be greater than zero: " + n2);
        }
        if (n2 != -1) {
            if (this.c == null || this.c instanceof bh) {
                this.c = this.b(n2);
            }
            this.F = n2;
        }
    }

    public int e() {
        this.c();
        if (this.F == -1) {
            this.F = this.h(true);
        }
        return this.F;
    }

    public void f() {
        this.c.m(this.e());
    }

    public ay g() {
        this.c();
        return this.c;
    }

    static Set h() {
        return (Set)R.get();
    }

    static Map i() {
        return (Map)Q.get();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void j() {
        this.c();
        if (bd.h().contains(this)) {
            return;
        }
        bd.h().add(this);
        if (this instanceof bi) {
            bd.i().put(this.g(), this);
        }
        try {
            Iterator iterator = this.a().values().iterator();
            while (iterator.hasNext()) {
                this.b((bp)iterator.next());
            }
        }
        finally {
            bd.h().remove(this);
            if (bd.i().get(this.g()) == this) {
                bd.i().remove(this.g());
            }
        }
    }

    protected int a(String string) {
        this.c();
        bp bp2 = (bp)this.a().get(string);
        if (bp2 == null) {
            throw new IllegalArgumentException("No such field: " + string);
        }
        return bp2.e;
    }

    public Object b(String string) {
        this.c();
        bp bp2 = (bp)this.a().get(string);
        if (bp2 == null) {
            throw new IllegalArgumentException("No such field: " + string);
        }
        return this.b(bp2);
    }

    Object a(bp bp2) {
        try {
            return bp2.c.get(this);
        }
        catch (Exception exception) {
            throw new Error("Exception reading field '" + bp2.a + "' in " + this.getClass() + ": " + exception);
        }
    }

    void a(bp bp2, Object object) {
        this.a(bp2, object, false);
    }

    void a(bp bp2, Object object, boolean bl2) {
        try {
            bp2.c.set(this, object);
        }
        catch (IllegalAccessException illegalAccessException) {
            int n2 = bp2.c.getModifiers();
            if (Modifier.isFinal(n2)) {
                if (bl2) {
                    throw new UnsupportedOperationException("This VM does not support Structures with final fields (field '" + bp2.a + "' within " + this.getClass() + ")");
                }
                throw new UnsupportedOperationException("Attempt to write to read-only field '" + bp2.a + "' within " + this.getClass());
            }
            throw new Error("Unexpectedly unable to write to field '" + bp2.a + "' within " + this.getClass() + ": " + illegalAccessException);
        }
    }

    static bd a(Class class_, bd bd2, ay ay2) {
        if (ay2 == null) {
            bd2 = null;
        } else {
            if (bd2 == null || !ay2.equals(bd2.g())) {
                bd bd3 = (bd)bd.i().get(ay2);
                if (bd3 != null && class_.equals(bd3.getClass())) {
                    bd2 = bd3;
                } else {
                    bd2 = bd.a(class_);
                    bd2.a(ay2);
                }
            }
            bd2.q();
        }
        return bd2;
    }

    Object b(bp bp2) {
        int n2 = bp2.e;
        Class class_ = bp2.b;
        FromNativeConverter fromNativeConverter = bp2.h;
        if (fromNativeConverter != null) {
            class_ = fromNativeConverter.a();
        }
        Object object = (o == null ? (o = bd.d("com.sun.jna.bd")) : o).isAssignableFrom(class_) || (p == null ? (p = bd.d("com.sun.jna.Callback")) : p).isAssignableFrom(class_) || ax.j && (q == null ? (q = bd.d("java.nio.Buffer")) : q).isAssignableFrom(class_) || (r == null ? (r = bd.d("com.sun.jna.ay")) : r).isAssignableFrom(class_) || (s == null ? (s = bd.d("com.sun.jna.au")) : s).isAssignableFrom(class_) || class_.isArray() ? this.a(bp2) : null;
        Object object2 = this.c.a((long)n2, class_, object);
        if (fromNativeConverter != null) {
            object2 = fromNativeConverter.a(object2, bp2.j);
        }
        this.a(bp2, object2, true);
        return object2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void k() {
        this.c();
        if (this instanceof bj) {
            this.n();
        }
        if (bd.h().contains(this)) {
            return;
        }
        bd.h().add(this);
        try {
            Iterator iterator = this.a().values().iterator();
            while (iterator.hasNext()) {
                bp bp2 = (bp)iterator.next();
                if (bp2.f) continue;
                this.c(bp2);
            }
        }
        finally {
            bd.h().remove(this);
        }
    }

    public void c(String string) {
        this.c();
        bp bp2 = (bp)this.a().get(string);
        if (bp2 == null) {
            throw new IllegalArgumentException("No such field: " + string);
        }
        this.c(bp2);
    }

    public void a(String string, Object object) {
        this.c();
        bp bp2 = (bp)this.a().get(string);
        if (bp2 == null) {
            throw new IllegalArgumentException("No such field: " + string);
        }
        this.a(bp2, object);
        this.c(bp2);
    }

    void c(bp bp2) {
        CharSequence charSequence;
        if (bp2.g) {
            return;
        }
        int n2 = bp2.e;
        Object object = this.a(bp2);
        Class class_ = bp2.b;
        ToNativeConverter toNativeConverter = bp2.i;
        if (toNativeConverter != null) {
            object = toNativeConverter.a(object, new br(this, bp2.c));
            class_ = toNativeConverter.a();
        }
        if ((t == null ? (t = bd.d("java.lang.String")) : t) == class_ || (u == null ? (u = bd.d("com.sun.jna.bw")) : u) == class_) {
            boolean bl2;
            boolean bl3 = bl2 = class_ == (u == null ? (u = bd.d("com.sun.jna.bw")) : u);
            if (object != null) {
                charSequence = new aw(object.toString(), bl2);
                this.J.put(bp2.a, charSequence);
                object = charSequence.a();
            } else {
                object = null;
                this.J.remove(bp2.a);
            }
        }
        try {
            this.c.a((long)n2, object, class_);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            charSequence = "Structure field \"" + bp2.a + "\" was declared as " + bp2.b + (bp2.b == class_ ? "" : " (native type " + class_ + ")") + ", which is not supported within a Structure";
            throw new IllegalArgumentException((String)charSequence);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean s() {
        bd bd2 = this;
        synchronized (bd2) {
            return this.M != null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected List l() {
        bd bd2 = this;
        synchronized (bd2) {
            if (this.M == null) {
                this.M = new ArrayList();
            }
            return this.M;
        }
    }

    protected void a(String[] arrstring) {
        this.l().addAll(Arrays.asList(arrstring));
        this.F = -1;
        if (this.c instanceof bh) {
            this.c = null;
        }
    }

    protected void a(List list, List list2) {
        block0: for (int i2 = 0; i2 < list2.size(); ++i2) {
            String string = (String)list2.get(i2);
            for (int i3 = 0; i3 < list.size(); ++i3) {
                Field field = (Field)list.get(i3);
                if (!string.equals(field.getName())) continue;
                Collections.swap(list, i2, i3);
                continue block0;
            }
        }
    }

    protected List a(boolean bl2) {
        ArrayList arrayList = new ArrayList();
        Object object = this.getClass();
        while (!object.equals(o == null ? bd.d("com.sun.jna.bd") : o)) {
            ArrayList<Field> arrayList2 = new ArrayList<Field>();
            Field[] arrfield = ((Class)object).getDeclaredFields();
            for (int i2 = 0; i2 < arrfield.length; ++i2) {
                int n2 = arrfield[i2].getModifiers();
                if (Modifier.isStatic(n2) || !Modifier.isPublic(n2)) continue;
                arrayList2.add(arrfield[i2]);
            }
            if (a) {
                Collections.reverse(arrayList2);
            }
            arrayList.addAll(0, arrayList2);
            object = ((Class)object).getSuperclass();
        }
        if (b || this.s()) {
            object = this.l();
            if (object.size() < arrayList.size()) {
                if (bl2) {
                    throw new Error("This VM does not store fields in a predictable order; you must use Structure.setFieldOrder to explicitly indicate the field order: " + System.getProperty("java.vendor") + ", " + System.getProperty("java.version"));
                }
                return null;
            }
            this.a(arrayList, (List)object);
        }
        return arrayList;
    }

    private synchronized boolean a(List list) {
        return this.M == list || this.M != null && ((Object)this.M).equals(list);
    }

    private int h(boolean bl2) {
        return this.a(bl2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    int a(boolean bl2, boolean bl3) {
        bn bn2;
        boolean bl4 = true;
        Map map = m;
        synchronized (map) {
            bn2 = (bn)m.get(this.getClass());
        }
        if (bn2 == null || this.G != bn2.d || this.K != bn2.e || !this.a(bn2.f)) {
            bn2 = this.b(bl2, bl3);
            bl4 = false;
        }
        if (bn2 != null) {
            this.H = bn2.b;
            this.I = bn2.c;
            bn2.d = this.G;
            bn2.e = this.K;
            bn2.f = this.M;
            if (!bn2.g) {
                map = m;
                synchronized (map) {
                    m.put(this.getClass(), bn2);
                }
            }
            if (bl4) {
                this.t();
            }
            return bn2.a;
        }
        return -1;
    }

    private bn b(boolean bl2, boolean bl3) {
        bn bn2 = new bn(this, null);
        int n2 = 0;
        List list = this.a(bl2);
        if (list == null) {
            return null;
        }
        boolean bl4 = true;
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Field field = (Field)iterator.next();
            int n3 = field.getModifiers();
            Class class_ = field.getType();
            if (class_.isArray()) {
                bn2.g = true;
            }
            bp bp2 = new bp(this);
            bp2.f = Modifier.isVolatile(n3);
            bp2.g = Modifier.isFinal(n3);
            if (bp2.g) {
                if (!ax.i) {
                    throw new IllegalArgumentException("This VM does not support read-only fields (field '" + field.getName() + "' within " + this.getClass() + ")");
                }
                field.setAccessible(true);
            }
            bp2.c = field;
            bp2.a = field.getName();
            bp2.b = class_;
            if ((p == null ? bd.d("com.sun.jna.Callback") : p).isAssignableFrom(class_) && !class_.isInterface()) {
                throw new IllegalArgumentException("Structure Callback field '" + field.getName() + "' must be an interface");
            }
            if (class_.isArray() && (o == null ? bd.d("com.sun.jna.bd") : o).equals(class_.getComponentType())) {
                String string = "Nested Structure arrays must use a derived Structure type so that the size of the elements can be determined";
                throw new IllegalArgumentException(string);
            }
            int n4 = 1;
            if (Modifier.isPublic(field.getModifiers())) {
                Object object;
                ToNativeConverter toNativeConverter;
                Object object2 = this.a(bp2);
                if (object2 == null && class_.isArray()) {
                    if (bl2) {
                        throw new IllegalStateException("Array fields must be initialized");
                    }
                    return null;
                }
                Class class_2 = class_;
                if ((s == null ? bd.d("com.sun.jna.au") : s).isAssignableFrom(class_)) {
                    toNativeConverter = av.a(class_);
                    class_2 = ((av)toNativeConverter).a();
                    bp2.i = toNativeConverter;
                    bp2.h = toNativeConverter;
                    bp2.j = new bq(this, field);
                } else if (this.K != null) {
                    toNativeConverter = this.K.b(class_);
                    object = this.K.a(class_);
                    if (toNativeConverter != null && object != null) {
                        class_2 = (object2 = toNativeConverter.a(object2, new br(this, bp2.c))) != null ? object2.getClass() : (r == null ? bd.d("com.sun.jna.ay") : r);
                        bp2.i = toNativeConverter;
                        bp2.h = object;
                        bp2.j = new bq(this, field);
                    } else if (toNativeConverter != null || object != null) {
                        String string = "Structures require bidirectional type conversion for " + class_;
                        throw new IllegalArgumentException(string);
                    }
                }
                if (object2 == null) {
                    object2 = this.a(bp2, class_);
                }
                try {
                    bp2.d = this.a(class_2, object2);
                    n4 = this.a(class_2, object2, bl4);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    if (!bl2 && this.K == null) {
                        return null;
                    }
                    object = "Invalid Structure field in " + this.getClass() + ", field name '" + bp2.a + "', " + bp2.b + ": " + illegalArgumentException.getMessage();
                    throw new IllegalArgumentException((String)object);
                }
                bn2.b = Math.max(bn2.b, n4);
                if (n2 % n4 != 0) {
                    n2 += n4 - n2 % n4;
                }
                bp2.e = n2;
                n2 += bp2.d;
                bn2.c.put(bp2.a, bp2);
            }
            bl4 = false;
        }
        if (n2 > 0) {
            int n5 = this.a(n2, bn2.b);
            if (this instanceof bj && !bl3) {
                this.n();
            }
            if (this.c != null && !(this.c instanceof bh)) {
                this.c = this.c.a(0L, (long)n5);
            }
            bn2.a = n5;
            return bn2;
        }
        throw new IllegalArgumentException("Structure " + this.getClass() + " has unknown size (ensure " + "all fields are public)");
    }

    private void t() {
        Iterator iterator = this.a().values().iterator();
        while (iterator.hasNext()) {
            bp bp2 = (bp)iterator.next();
            this.a(bp2, bp2.b);
        }
    }

    private Object a(bp bp2, Class class_) {
        Object object = null;
        if ((o == null ? (o = bd.d("com.sun.jna.bd")) : o).isAssignableFrom(class_) && !(v == null ? (v = bd.d("com.sun.jna.bi")) : v).isAssignableFrom(class_)) {
            try {
                object = bd.a(class_);
                this.a(bp2, object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                String string = "Can't determine size of nested structure: " + illegalArgumentException.getMessage();
                throw new IllegalArgumentException(string);
            }
        } else if ((s == null ? (s = bd.d("com.sun.jna.au")) : s).isAssignableFrom(class_)) {
            av av2 = av.a(class_);
            object = av2.b();
            this.a(bp2, object);
        }
        return object;
    }

    int d(int n2) {
        return this.a(n2, this.H);
    }

    private int a(int n2, int n3) {
        if (this.G != 1 && n2 % n3 != 0) {
            n2 += n3 - n2 % n3;
        }
        return n2;
    }

    protected int m() {
        if (this.F == -1) {
            this.h(true);
        }
        return this.H;
    }

    protected int a(Class class_, Object object, boolean bl2) {
        int n2 = 1;
        if ((s == null ? (s = bd.d("com.sun.jna.au")) : s).isAssignableFrom(class_)) {
            av av2 = av.a(class_);
            class_ = av2.a();
            object = av2.a(object, new bs());
        }
        int n3 = Native.a(class_, object);
        if (class_.isPrimitive() || (w == null ? (w = bd.d("java.lang.Long")) : w) == class_ || (x == null ? (x = bd.d("java.lang.Integer")) : x) == class_ || (y == null ? (y = bd.d("java.lang.Short")) : y) == class_ || (z == null ? (z = bd.d("java.lang.Character")) : z) == class_ || (A == null ? (A = bd.d("java.lang.Byte")) : A) == class_ || (B == null ? (B = bd.d("java.lang.Boolean")) : B) == class_ || (C == null ? (C = bd.d("java.lang.Float")) : C) == class_ || (D == null ? (D = bd.d("java.lang.Double")) : D) == class_) {
            n2 = n3;
        } else if ((r == null ? (r = bd.d("com.sun.jna.ay")) : r) == class_ || ax.j && (q == null ? (q = bd.d("java.nio.Buffer")) : q).isAssignableFrom(class_) || (p == null ? (p = bd.d("com.sun.jna.Callback")) : p).isAssignableFrom(class_) || (u == null ? (u = bd.d("com.sun.jna.bw")) : u) == class_ || (t == null ? (t = bd.d("java.lang.String")) : t) == class_) {
            n2 = ay.H;
        } else if ((o == null ? (o = bd.d("com.sun.jna.bd")) : o).isAssignableFrom(class_)) {
            if ((v == null ? (v = bd.d("com.sun.jna.bi")) : v).isAssignableFrom(class_)) {
                n2 = ay.H;
            } else {
                if (object == null) {
                    object = bd.a(class_);
                }
                n2 = ((bd)object).m();
            }
        } else if (class_.isArray()) {
            n2 = this.a(class_.getComponentType(), null, bl2);
        } else {
            throw new IllegalArgumentException("Type " + class_ + " has unknown " + "native alignment");
        }
        if (this.G == 1) {
            n2 = 1;
        } else if (this.G == 3) {
            n2 = Math.min(8, n2);
        } else if (!(this.G != 2 || bl2 && ax.b() && d)) {
            n2 = Math.min(k, n2);
        }
        return n2;
    }

    public String toString() {
        return this.b(Boolean.getBoolean("jna.dump_memory"));
    }

    public String b(boolean bl2) {
        return this.a(0, true, true);
    }

    private String b(Class class_) {
        String string = class_.getName();
        int n2 = string.lastIndexOf(".");
        return string.substring(n2 + 1);
    }

    private String a(int n2, boolean bl2, boolean bl3) {
        Object object;
        this.c();
        String string = System.getProperty("line.separator");
        String string2 = this.b(this.getClass()) + "(" + this.g() + ")";
        if (!(this.g() instanceof ac)) {
            string2 = string2 + " (" + this.e() + " bytes)";
        }
        String string3 = "";
        for (int i2 = 0; i2 < n2; ++i2) {
            string3 = string3 + "  ";
        }
        String string4 = string;
        if (!bl2) {
            string4 = "...}";
        } else {
            Iterator iterator = this.a().values().iterator();
            while (iterator.hasNext()) {
                object = (bp)iterator.next();
                Object object2 = this.a((bp)object);
                String string5 = this.b(((bp)object).b);
                String string6 = "";
                string4 = string4 + string3;
                if (((bp)object).b.isArray() && object2 != null) {
                    string5 = this.b(((bp)object).b.getComponentType());
                    string6 = "[" + Array.getLength(object2) + "]";
                }
                string4 = string4 + "  " + string5 + " " + ((bp)object).a + string6 + "@" + Integer.toHexString(((bp)object).e);
                if (object2 instanceof bd) {
                    object2 = ((bd)object2).a(n2 + 1, !(object2 instanceof bi), bl3);
                }
                string4 = string4 + "=";
                string4 = object2 instanceof Long ? string4 + Long.toHexString((Long)object2) : (object2 instanceof Integer ? string4 + Integer.toHexString((Integer)object2) : (object2 instanceof Short ? string4 + Integer.toHexString(((Short)object2).shortValue()) : (object2 instanceof Byte ? string4 + Integer.toHexString(((Byte)object2).byteValue()) : string4 + String.valueOf(object2).trim())));
                string4 = string4 + string;
                if (iterator.hasNext()) continue;
                string4 = string4 + string3 + "}";
            }
        }
        if (n2 == 0 && bl3) {
            int n3 = 4;
            string4 = string4 + string + "memory dump" + string;
            object = this.g().b(0L, this.e());
            for (int i3 = 0; i3 < ((Object)object).length; ++i3) {
                if (i3 % 4 == 0) {
                    string4 = string4 + "[";
                }
                if (object[i3] >= 0 && object[i3] < 16) {
                    string4 = string4 + "0";
                }
                string4 = string4 + Integer.toHexString(object[i3] & 0xFF);
                if (i3 % 4 != 3 || i3 >= ((Object)object).length - 1) continue;
                string4 = string4 + "]" + string;
            }
            string4 = string4 + "]";
        }
        return string2 + " {" + string4;
    }

    public bd[] a(bd[] arrbd) {
        int n2;
        this.c();
        if (this.c instanceof bh) {
            ac ac2 = (ac)this.c;
            n2 = arrbd.length * this.e();
            if (ac2.g() < (long)n2) {
                this.a(this.b(n2));
            }
        }
        arrbd[0] = this;
        int n3 = this.e();
        for (n2 = 1; n2 < arrbd.length; ++n2) {
            arrbd[n2] = bd.a(this.getClass());
            arrbd[n2].a(this.c.a((long)(n2 * n3), (long)n3));
            arrbd[n2].j();
        }
        if (!(this instanceof bj)) {
            this.P = arrbd;
        }
        return arrbd;
    }

    public bd[] e(int n2) {
        return this.a((bd[])Array.newInstance(this.getClass(), n2));
    }

    private Class u() {
        if ((this instanceof bi || this instanceof bj) && (o == null ? (o = bd.d("com.sun.jna.bd")) : o).isAssignableFrom(this.getClass().getSuperclass())) {
            return this.getClass().getSuperclass();
        }
        return this.getClass();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bd)) {
            return false;
        }
        if (object.getClass() != this.getClass() && ((bd)object).u() != this.u()) {
            return false;
        }
        bd bd2 = (bd)object;
        if (bd2.g().equals(this.g())) {
            return true;
        }
        if (bd2.e() == this.e()) {
            this.f();
            this.k();
            byte[] arrby = this.g().b(0L, this.e());
            bd2.f();
            bd2.k();
            byte[] arrby2 = bd2.g().b(0L, bd2.e());
            return Arrays.equals(arrby, arrby2);
        }
        return false;
    }

    public int hashCode() {
        this.f();
        this.k();
        Adler32 adler32 = new Adler32();
        adler32.update(this.g().b(0L, this.e()));
        return (int)adler32.getValue();
    }

    protected void b(ay ay2) {
        this.L = ay2.J;
    }

    protected ay d(bp bp2) {
        ToNativeConverter toNativeConverter;
        Class class_ = bp2.b;
        Object object = this.a(bp2);
        if (this.K != null && (toNativeConverter = this.K.b(class_)) != null) {
            class_ = toNativeConverter.a();
            object = toNativeConverter.a(object, new bs());
        }
        return bk.a(object, class_);
    }

    ay n() {
        ay ay2 = bd.a(this);
        this.b(ay2);
        return ay2;
    }

    public void c(boolean bl2) {
        this.d(bl2);
        this.e(bl2);
    }

    public void d(boolean bl2) {
        this.N = bl2;
    }

    public boolean o() {
        return this.N;
    }

    public void e(boolean bl2) {
        this.O = bl2;
    }

    public boolean p() {
        return this.O;
    }

    static ay a(Object object) {
        return bk.b(object);
    }

    public static bd a(Class class_) {
        try {
            bd bd2 = (bd)class_.newInstance();
            if (bd2 instanceof bj) {
                bd2.d();
            }
            return bd2;
        }
        catch (InstantiationException instantiationException) {
            String string = "Can't instantiate " + class_ + " (" + instantiationException + ")";
            throw new IllegalArgumentException(string);
        }
        catch (IllegalAccessException illegalAccessException) {
            String string = "Instantiation of " + class_ + " not allowed, is it public? (" + illegalAccessException + ")";
            throw new IllegalArgumentException(string);
        }
    }

    private static void d(bd[] arrbd) {
        ay ay2 = arrbd[0].g();
        int n2 = arrbd[0].e();
        for (int i2 = 1; i2 < arrbd.length; ++i2) {
            if (arrbd[i2].g().J == ay2.J + (long)(n2 * i2)) continue;
            String string = "Structure array elements must use contiguous memory (bad backing address at Structure array index " + i2 + ")";
            throw new IllegalArgumentException(string);
        }
    }

    public static void b(bd[] arrbd) {
        bd.d(arrbd);
        if (arrbd[0].P == arrbd) {
            arrbd[0].q();
        } else {
            for (int i2 = 0; i2 < arrbd.length; ++i2) {
                arrbd[i2].q();
            }
        }
    }

    public void q() {
        if (this.o()) {
            this.j();
            if (this.P != null) {
                for (int i2 = 1; i2 < this.P.length; ++i2) {
                    this.P[i2].q();
                }
            }
        }
    }

    public static void c(bd[] arrbd) {
        bd.d(arrbd);
        if (arrbd[0].P == arrbd) {
            arrbd[0].r();
        } else {
            for (int i2 = 0; i2 < arrbd.length; ++i2) {
                arrbd[i2].r();
            }
        }
    }

    public void r() {
        if (this.p()) {
            this.k();
            if (this.P != null) {
                for (int i2 = 1; i2 < this.P.length; ++i2) {
                    this.P[i2].r();
                }
            }
        }
    }

    protected int a(Class class_, Object object) {
        return Native.a(class_, object);
    }

    static Class d(String string) {
        try {
            return Class.forName(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new NoClassDefFoundError().initCause(classNotFoundException);
        }
    }

    static void a(bd bd2, boolean bl2) {
        bd2.f(bl2);
    }

    static {
        Field[] arrfield = (n == null ? (n = bd.d("com.sun.jna.bo")) : n).getFields();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (int i2 = 0; i2 < arrfield.length; ++i2) {
            arrayList.add(arrfield[i2].getName());
        }
        List<String> list = Arrays.asList(bo.a());
        ArrayList<String> arrayList2 = new ArrayList<String>(list);
        Collections.reverse(arrayList2);
        a = ((Object)arrayList).equals(arrayList2);
        b = !((Object)arrayList).equals(list) && !a;
        String string = System.getProperty("os.arch").toLowerCase();
        d = "ppc".equals(string) || "powerpc".equals(string);
        e = "sparc".equals(string);
        f = "arm".equals(string);
        k = e || (d || f) && ax.c() ? 8 : Native.b;
        m = new WeakHashMap();
        Q = new be();
        R = new bf();
    }
}

