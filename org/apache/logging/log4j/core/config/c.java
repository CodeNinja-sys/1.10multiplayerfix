/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.config;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.logging.log4j.b;
import org.apache.logging.log4j.core.config.h;
import org.apache.logging.log4j.core.config.k;
import org.apache.logging.log4j.core.config.l;
import org.apache.logging.log4j.core.config.n;
import org.apache.logging.log4j.core.config.p;
import org.apache.logging.log4j.core.config.plugins.PluginManager;
import org.apache.logging.log4j.core.config.plugins.e;
import org.apache.logging.log4j.core.config.plugins.f;
import org.apache.logging.log4j.core.config.plugins.g;
import org.apache.logging.log4j.core.config.plugins.j;
import org.apache.logging.log4j.core.config.v;
import org.apache.logging.log4j.core.config.x;
import org.apache.logging.log4j.core.config.y;
import org.apache.logging.log4j.core.d.r;
import org.apache.logging.log4j.core.i;
import org.apache.logging.log4j.d;

public class c
extends org.apache.logging.log4j.core.c.b
implements org.apache.logging.log4j.core.config.d {
    protected static final d a = org.apache.logging.log4j.d.d.k();
    protected y b;
    protected final List c = new CopyOnWriteArrayList();
    protected l d = new p();
    private org.apache.logging.log4j.core.net.d i = new n();
    protected Map e;
    private y j = null;
    private Object k;
    protected boolean f = true;
    private String l;
    private ConcurrentMap m = new ConcurrentHashMap();
    private ConcurrentMap n = new ConcurrentHashMap();
    private final org.apache.logging.log4j.core.h.g o = new org.apache.logging.log4j.core.h.d();
    private final org.apache.logging.log4j.core.h.n p = new org.apache.logging.log4j.core.h.n(this.o);
    private v q = new v();
    private final boolean r = false;
    private final ConcurrentMap s = new ConcurrentHashMap();
    protected PluginManager g = new PluginManager("Core");

    protected c() {
        this.b = new y();
    }

    @Override
    public Map c() {
        return (Map)this.s.get("ContextProperties");
    }

    @Override
    public void d() {
        this.g.b();
        this.g();
        this.q();
        this.i();
        for (Object object : this.n.values()) {
            ((org.apache.logging.log4j.core.c.b)object).aZ_();
        }
        for (Object object : this.m.values()) {
            object.e();
        }
        this.q.aZ_();
        this.aZ_();
    }

    @Override
    public void e() {
        org.apache.logging.log4j.core.b[] arrb = this.m.values().toArray(new org.apache.logging.log4j.core.b[this.m.size()]);
        for (int i2 = arrb.length - 1; i2 >= 0; --i2) {
            arrb[i2].f();
        }
        for (v v2 : this.n.values()) {
            v2.g();
            v2.ba_();
        }
        this.q.ba_();
        this.ba_();
        if (this.i != null && this.k != null) {
            this.i.a(this.k);
        }
    }

    @Override
    public boolean f() {
        return this.f;
    }

    protected void g() {
    }

    protected b h() {
        String string = org.apache.logging.log4j.e.b.a().a("Log4jDefaultStatusLevel", org.apache.logging.log4j.b.c.name());
        try {
            return org.apache.logging.log4j.b.a(string);
        }
        catch (Exception exception) {
            return org.apache.logging.log4j.b.c;
        }
    }

    protected void a(String string, h h2, byte[] arrby, String string2) {
        if (string != null) {
            y y2 = new y(null, string, null);
            Map map = y2.a();
            map.put("content", new String(arrby));
            map.put("contentType", string2);
            map.put("name", "configuration");
            if (h2.b() != null) {
                map.put("location", h2.b());
            }
            this.j = y2;
        }
    }

    private void q() {
        String string;
        org.apache.logging.log4j.core.config.plugins.k k2;
        if (this.j != null && (k2 = this.g.b(string = this.j.f())) != null) {
            Class class_ = k2.a();
            try {
                this.i = (org.apache.logging.log4j.core.net.d)class_.newInstance();
                this.k = this.i.a(this.j.a());
            }
            catch (InstantiationException instantiationException) {
                System.err.println("InstantiationException attempting to instantiate advertiser: " + string);
            }
            catch (IllegalAccessException illegalAccessException) {
                System.err.println("IllegalAccessException attempting to instantiate advertiser: " + string);
            }
        }
    }

    @Override
    public Object a(String string) {
        return this.s.get(string);
    }

    @Override
    public void a(String string, Object object) {
        this.s.putIfAbsent(string, object);
    }

    protected void i() {
        Object object;
        boolean bl2 = false;
        boolean bl3 = false;
        for (y object2 : this.b.b()) {
            this.a(object2, null);
            if (object2.h() == null) continue;
            if (object2.f().equalsIgnoreCase("Properties")) {
                if (this.o == this.p.d()) {
                    this.p.a((org.apache.logging.log4j.core.h.g)object2.h());
                    continue;
                }
                a.b("Properties declaration must be the first element in the configuration");
                continue;
            }
            if (this.o == this.p.d()) {
                object = (Map)this.s.get("ContextProperties");
                org.apache.logging.log4j.core.h.f f2 = object == null ? null : new org.apache.logging.log4j.core.h.f((Map)object);
                this.p.a(new org.apache.logging.log4j.core.h.d(f2));
            }
            if (object2.f().equalsIgnoreCase("Appenders")) {
                this.m = (ConcurrentMap)object2.h();
                continue;
            }
            if (object2.h() instanceof org.apache.logging.log4j.core.d) {
                this.a((org.apache.logging.log4j.core.d)object2.h());
                continue;
            }
            if (object2.f().equalsIgnoreCase("Loggers")) {
                object = (x)object2.h();
                this.n = ((x)object).a();
                bl3 = true;
                if (((x)object).b() == null) continue;
                this.q = ((x)object).b();
                bl2 = true;
                continue;
            }
            a.b("Unknown object \"" + object2.f() + "\" of type " + object2.h().getClass().getName() + " is ignored");
        }
        if (!bl3) {
            a.f("No Loggers were configured, using default. Is the Loggers element missing?");
            this.r();
            return;
        }
        if (!bl2) {
            a.f("No Root logger was configured, creating default ERROR-level Root logger with Console appender");
            this.r();
        }
        for (Map.Entry entry : this.n.entrySet()) {
            object = (v)entry.getValue();
            for (org.apache.logging.log4j.core.config.b b2 : ((v)object).h()) {
                org.apache.logging.log4j.core.b b3 = (org.apache.logging.log4j.core.b)this.m.get(b2.a());
                if (b3 != null) {
                    ((v)object).a(b3, b2.b(), b2.c());
                    continue;
                }
                a.b("Unable to locate appender " + b2.a() + " for logger " + ((v)object).d());
            }
        }
        this.t();
    }

    private void r() {
        this.b("Default");
        org.apache.logging.log4j.core.g.g g2 = org.apache.logging.log4j.core.g.g.a("%d{HH:mm:ss.SSS} [%thread] %-5level %logger{36} - %msg%n", null, null, null, null);
        org.apache.logging.log4j.core.a.g g3 = org.apache.logging.log4j.core.a.g.a(g2, null, "SYSTEM_OUT", "Console", "false", "true");
        g3.e();
        this.a(g3);
        v v2 = this.o();
        v2.a(g3, null, null);
        String string = org.apache.logging.log4j.e.b.a().a("org.apache.logging.log4j.level");
        b b2 = string != null && org.apache.logging.log4j.b.valueOf(string) != null ? org.apache.logging.log4j.b.valueOf(string) : org.apache.logging.log4j.b.c;
        v2.a(b2);
    }

    public void b(String string) {
        this.l = string;
    }

    @Override
    public String j() {
        return this.l;
    }

    @Override
    public void a(k k2) {
        this.c.add(k2);
    }

    @Override
    public void b(k k2) {
        this.c.remove(k2);
    }

    public org.apache.logging.log4j.core.b c(String string) {
        return (org.apache.logging.log4j.core.b)this.m.get(string);
    }

    @Override
    public Map k() {
        return this.m;
    }

    public void a(org.apache.logging.log4j.core.b b2) {
        this.m.put(b2.a(), b2);
    }

    @Override
    public org.apache.logging.log4j.core.h.n l() {
        return this.p;
    }

    @Override
    public void a(l l2) {
        this.d = l2;
    }

    @Override
    public l m() {
        return this.d;
    }

    @Override
    public void a(org.apache.logging.log4j.core.net.d d2) {
        this.i = d2;
    }

    @Override
    public org.apache.logging.log4j.core.net.d n() {
        return this.i;
    }

    @Override
    public synchronized void a(i i2, org.apache.logging.log4j.core.b b2) {
        String string = i2.d();
        this.m.putIfAbsent(b2.a(), b2);
        v v2 = this.e(string);
        if (v2.d().equals(string)) {
            v2.a(b2, null, null);
        } else {
            v v3 = new v(string, v2.i(), v2.k());
            v3.a(b2, null, null);
            v3.a(v2);
            this.n.putIfAbsent(string, v3);
            this.t();
            i2.l().j();
        }
    }

    @Override
    public synchronized void a(i i2, org.apache.logging.log4j.core.d d2) {
        String string = i2.d();
        v v2 = this.e(string);
        if (v2.d().equals(string)) {
            v2.a(d2);
        } else {
            v v3 = new v(string, v2.i(), v2.k());
            v3.a(d2);
            v3.a(v2);
            this.n.putIfAbsent(string, v3);
            this.t();
            i2.l().j();
        }
    }

    @Override
    public synchronized void a(i i2, boolean bl2) {
        String string = i2.d();
        v v2 = this.e(string);
        if (v2.d().equals(string)) {
            v2.a(bl2);
        } else {
            v v3 = new v(string, v2.i(), bl2);
            v3.a(v2);
            this.n.putIfAbsent(string, v3);
            this.t();
            i2.l().j();
        }
    }

    public synchronized void d(String string) {
        for (v v2 : this.n.values()) {
            v2.b(string);
        }
        org.apache.logging.log4j.core.b b2 = (org.apache.logging.log4j.core.b)this.m.remove(string);
        if (b2 != null) {
            b2.f();
        }
    }

    @Override
    public v e(String string) {
        if (this.n.containsKey(string)) {
            return (v)this.n.get(string);
        }
        String string2 = string;
        while ((string2 = org.apache.logging.log4j.core.d.r.a(string2)) != null) {
            if (!this.n.containsKey(string2)) continue;
            return (v)this.n.get(string2);
        }
        return this.q;
    }

    public v o() {
        return this.q;
    }

    @Override
    public Map p() {
        return Collections.unmodifiableMap(this.n);
    }

    public v f(String string) {
        return (v)this.n.get(string);
    }

    public void a(String string, v v2) {
        this.n.put(string, v2);
        this.t();
    }

    public void g(String string) {
        this.n.remove(string);
        this.t();
    }

    @Override
    public void a(y y2, org.apache.logging.log4j.core.h h2) {
        org.apache.logging.log4j.core.config.plugins.k k2 = y2.i();
        if (k2 != null && k2.d()) {
            y2.a(this.a(k2, y2, h2));
        } else {
            for (y y3 : y2.b()) {
                this.a(y3, h2);
            }
            if (k2 == null) {
                if (y2.e() != null) {
                    a.b("Unable to locate plugin for " + y2.f());
                }
            } else {
                y2.a(this.a(k2, y2, h2));
            }
        }
    }

    private Object a(org.apache.logging.log4j.core.config.plugins.k k2, y y2, org.apache.logging.log4j.core.h h2) {
        Class<?>[] arrclass;
        Class class_ = k2.a();
        if (Map.class.isAssignableFrom(class_)) {
            try {
                Map map = (Map)class_.newInstance();
                for (y y3 : y2.b()) {
                    map.put(y3.f(), y3.h());
                }
                return map;
            }
            catch (Exception exception) {
                a.f("Unable to create Map for " + k2.b() + " of class " + class_);
            }
        }
        if (List.class.isAssignableFrom(class_)) {
            try {
                List list = (List)class_.newInstance();
                for (y y4 : y2.b()) {
                    list.add(y4.h());
                }
                return list;
            }
            catch (Exception exception) {
                a.f("Unable to create List for " + k2.b() + " of class " + class_);
            }
        }
        Method method = null;
        for (Method method2 : class_.getMethods()) {
            if (!method2.isAnnotationPresent(org.apache.logging.log4j.core.config.plugins.h.class)) continue;
            method = method2;
            break;
        }
        if (method == null) {
            return null;
        }
        Method[] arrmethod = method.getParameterAnnotations();
        if (arrmethod.length != (arrclass = method.getParameterTypes()).length) {
            a.b("Number of parameter annotations does not equal the number of paramters");
        }
        Object[] arrobject = new Object[arrclass.length];
        int n2 = 0;
        Map map = y2.a();
        List list = y2.b();
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        for (Method object : arrmethod) {
            String[] arrstring = null;
            for (Method method2 : object) {
                if (!(method2 instanceof org.apache.logging.log4j.core.config.plugins.d)) continue;
                arrstring = ((org.apache.logging.log4j.core.config.plugins.d)((Object)method2)).a();
            }
            for (Method method2 : object) {
                Class<?> class_2;
                String string;
                Object object2;
                if (method2 instanceof org.apache.logging.log4j.core.config.plugins.d) continue;
                if (stringBuilder.length() == 0) {
                    stringBuilder.append(" with params(");
                } else {
                    stringBuilder.append(", ");
                }
                if (method2 instanceof j) {
                    arrobject[n2] = y2;
                    stringBuilder.append("Node=").append(y2.f());
                    continue;
                }
                if (method2 instanceof f) {
                    arrobject[n2] = this;
                    if (this.l != null) {
                        stringBuilder.append("Configuration(").append(this.l).append(")");
                        continue;
                    }
                    stringBuilder.append("Configuration");
                    continue;
                }
                if (method2 instanceof org.apache.logging.log4j.core.config.plugins.l) {
                    object2 = ((org.apache.logging.log4j.core.config.plugins.l)((Object)method2)).a();
                    string = y2.d();
                    if (string == null) {
                        string = this.a("value", null, map);
                    }
                    class_2 = this.p.a(h2, string);
                    stringBuilder.append((String)object2).append("=\"").append((String)((Object)class_2)).append("\"");
                    arrobject[n2] = class_2;
                    continue;
                }
                if (method2 instanceof e) {
                    object2 = (e)((Object)method2);
                    string = object2.a();
                    class_2 = this.p.a(h2, this.a(string, arrstring, map));
                    stringBuilder.append(string).append("=\"").append((String)((Object)class_2)).append("\"");
                    arrobject[n2] = class_2;
                    continue;
                }
                if (!(method2 instanceof g)) continue;
                object2 = (g)((Object)method2);
                string = object2.a();
                if (arrclass[n2].isArray()) {
                    Object object3;
                    Object object4;
                    class_2 = arrclass[n2].getComponentType();
                    ArrayList<Object> arrayList2 = new ArrayList<Object>();
                    stringBuilder.append(string).append("={");
                    boolean bl2 = true;
                    for (y k3 : list) {
                        object4 = k3.i();
                        if (!object2.a().equalsIgnoreCase(((org.apache.logging.log4j.core.config.plugins.k)object4).b()) && !class_2.isAssignableFrom(((org.apache.logging.log4j.core.config.plugins.k)object4).a())) continue;
                        arrayList.add(k3);
                        if (!bl2) {
                            stringBuilder.append(", ");
                        }
                        bl2 = false;
                        object3 = k3.h();
                        if (object3 == null) {
                            a.b("Null object returned for " + k3.f() + " in " + y2.f());
                            continue;
                        }
                        if (object3.getClass().isArray()) {
                            this.a(stringBuilder, (Object[])object3);
                            arrobject[n2] = object3;
                            break;
                        }
                        stringBuilder.append(k3.toString());
                        arrayList2.add(object3);
                    }
                    stringBuilder.append("}");
                    if (arrobject[n2] != null) break;
                    if (arrayList2.size() > 0 && !class_2.isAssignableFrom(arrayList2.get(0).getClass())) {
                        a.b("Attempted to assign List containing class " + arrayList2.get(0).getClass().getName() + " to array of type " + class_2 + " for attribute " + string);
                        break;
                    }
                    Object[] arrobject2 = (Object[])Array.newInstance(class_2, arrayList2.size());
                    int n3 = 0;
                    object4 = arrayList2.iterator();
                    while (object4.hasNext()) {
                        arrobject2[n3] = object3 = object4.next();
                        ++n3;
                    }
                    arrobject[n2] = arrobject2;
                    continue;
                }
                class_2 = arrclass[n2];
                boolean bl3 = false;
                for (Object[] arrobject2 : list) {
                    org.apache.logging.log4j.core.config.plugins.k k3 = arrobject2.i();
                    if (!object2.a().equals(k3.b()) && !class_2.isAssignableFrom(k3.a())) continue;
                    stringBuilder.append(arrobject2.f()).append("(").append(arrobject2.toString()).append(")");
                    bl3 = true;
                    arrayList.add(arrobject2);
                    arrobject[n2] = arrobject2.h();
                    break;
                }
                if (bl3) continue;
                stringBuilder.append("null");
            }
            ++n2;
        }
        if (stringBuilder.length() > 0) {
            stringBuilder.append(")");
        }
        if (map.size() > 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            for (String string : map.keySet()) {
                if (stringBuilder2.length() == 0) {
                    stringBuilder2.append(y2.f());
                    stringBuilder2.append(" contains ");
                    if (map.size() == 1) {
                        stringBuilder2.append("an invalid element or attribute ");
                    } else {
                        stringBuilder2.append("invalid attributes ");
                    }
                } else {
                    stringBuilder2.append(", ");
                }
                stringBuilder2.append("\"");
                stringBuilder2.append(string);
                stringBuilder2.append("\"");
            }
            a.b(stringBuilder2.toString());
        }
        if (!k2.d() && arrayList.size() != list.size()) {
            for (y y6 : list) {
                if (arrayList.contains(y6)) continue;
                String string = y2.i().b();
                String string2 = string.equals(y2.f()) ? y2.f() : string + " " + y2.f();
                a.b(string2 + " has no parameter that matches element " + y6.f());
            }
        }
        try {
            int n4 = method.getModifiers();
            if (!Modifier.isStatic(n4)) {
                a.b(method.getName() + " method is not static on class " + class_.getName() + " for element " + y2.f());
                return null;
            }
            a.a("Calling {} on class {} for element {}{}", method.getName(), class_.getName(), y2.f(), stringBuilder.toString());
            return method.invoke(null, arrobject);
        }
        catch (Exception exception) {
            a.b("Unable to invoke method " + method.getName() + " in class " + class_.getName() + " for element " + y2.f(), (Throwable)exception);
            return null;
        }
    }

    private void a(StringBuilder stringBuilder, Object ... arrobject) {
        boolean bl2 = true;
        for (Object object : arrobject) {
            if (!bl2) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(object.toString());
            bl2 = false;
        }
    }

    private String a(String string, String[] arrstring, Map map) {
        for (String string2 : map.keySet()) {
            if (string2.equalsIgnoreCase(string)) {
                String string3 = (String)map.get(string2);
                map.remove(string2);
                return string3;
            }
            if (arrstring == null) continue;
            for (String string4 : arrstring) {
                if (!string2.equalsIgnoreCase(string4)) continue;
                String string5 = (String)map.get(string2);
                map.remove(string2);
                return string5;
            }
        }
        return null;
    }

    private void t() {
        for (Map.Entry entry : this.n.entrySet()) {
            v v2 = (v)entry.getValue();
            String string = (String)entry.getKey();
            if (string.equals("")) continue;
            int n2 = string.lastIndexOf(46);
            if (n2 > 0) {
                v v3 = this.e(string = string.substring(0, n2));
                if (v3 == null) {
                    v3 = this.q;
                }
                v2.a(v3);
                continue;
            }
            v2.a(this.q);
        }
    }
}

