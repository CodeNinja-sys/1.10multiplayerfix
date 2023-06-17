/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.a.m;

public class s
implements m {
    public static final String a = "[...";
    public static final String b = "...]";
    public static final String c = "[!!!";
    public static final String d = "=>";
    public static final String e = ":";
    public static final String f = "!!!]";
    private static final long g = -665975803997290697L;
    private static final int h = 31;
    private static final char i = '{';
    private static final char j = '}';
    private static final char k = '\\';
    private final String l;
    private final String[] m;
    private transient Object[] n;
    private transient String o;
    private transient Throwable p;

    public s(String string, String[] arrstring, Throwable throwable) {
        this.l = string;
        this.m = arrstring;
        this.p = throwable;
    }

    public s(String string, Object[] arrobject, Throwable throwable) {
        this.l = string;
        this.p = throwable;
        this.m = this.a(arrobject);
    }

    public s(String string, Object[] arrobject) {
        this.l = string;
        this.m = this.a(arrobject);
    }

    public s(String string, Object object) {
        this(string, new Object[]{object});
    }

    public s(String string, Object object, Object object2) {
        this(string, new Object[]{object, object2});
    }

    private String[] a(Object[] arrobject) {
        String[] arrstring;
        if (arrobject == null) {
            return null;
        }
        int n2 = s.a(this.l);
        int n3 = arrobject.length;
        if (n2 < arrobject.length && this.p == null && arrobject[arrobject.length - 1] instanceof Throwable) {
            this.p = (Throwable)arrobject[arrobject.length - 1];
            --n3;
        }
        this.n = new Object[n3];
        for (int i2 = 0; i2 < n3; ++i2) {
            this.n[i2] = arrobject[i2];
        }
        if (n2 == 1 && this.p == null && arrobject.length > 1) {
            arrstring = new String[]{s.a(arrobject)};
        } else {
            arrstring = new String[n3];
            for (int i3 = 0; i3 < arrstring.length; ++i3) {
                arrstring[i3] = s.a(arrobject[i3]);
            }
        }
        return arrstring;
    }

    @Override
    public String a() {
        if (this.o == null) {
            this.o = this.a(this.l, this.m);
        }
        return this.o;
    }

    @Override
    public String b() {
        return this.l;
    }

    @Override
    public Object[] c() {
        if (this.n != null) {
            return this.n;
        }
        return this.m;
    }

    @Override
    public Throwable d() {
        return this.p;
    }

    protected String a(String string, String[] arrstring) {
        return s.a(string, arrstring);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        s s2 = (s)object;
        if (this.l != null ? !this.l.equals(s2.l) : s2.l != null) {
            return false;
        }
        return Arrays.equals(this.m, s2.m);
    }

    public int hashCode() {
        int n2 = this.l != null ? this.l.hashCode() : 0;
        n2 = 31 * n2 + (this.m != null ? Arrays.hashCode(this.m) : 0);
        return n2;
    }

    public static String a(String string, Object[] arrobject) {
        if (string == null || arrobject == null || arrobject.length == 0) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = 0;
        int n3 = 0;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            int n4;
            char c2 = string.charAt(i2);
            if (c2 == '\\') {
                ++n2;
                continue;
            }
            if (c2 == '{' && i2 < string.length() - 1 && string.charAt(i2 + 1) == '}') {
                n4 = n2 / 2;
                for (int i3 = 0; i3 < n4; ++i3) {
                    stringBuilder.append('\\');
                }
                if (n2 % 2 == 1) {
                    stringBuilder.append('{');
                    stringBuilder.append('}');
                } else {
                    if (n3 < arrobject.length) {
                        stringBuilder.append(arrobject[n3]);
                    } else {
                        stringBuilder.append('{').append('}');
                    }
                    ++n3;
                }
                ++i2;
                n2 = 0;
                continue;
            }
            if (n2 > 0) {
                for (n4 = 0; n4 < n2; ++n4) {
                    stringBuilder.append('\\');
                }
                n2 = 0;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static int a(String string) {
        if (string == null) {
            return 0;
        }
        int n2 = string.indexOf(123);
        if (n2 == -1) {
            return 0;
        }
        int n3 = 0;
        boolean bl2 = false;
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '\\') {
                bl2 = !bl2;
                continue;
            }
            if (c2 == '{') {
                if (!bl2 && i2 < string.length() - 1 && string.charAt(i2 + 1) == '}') {
                    ++n3;
                    ++i2;
                }
                bl2 = false;
                continue;
            }
            bl2 = false;
        }
        return n3;
    }

    public static String a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof String) {
            return (String)object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        HashSet hashSet = new HashSet();
        s.a(object, stringBuilder, hashSet);
        return stringBuilder.toString();
    }

    private static void a(Object object, StringBuilder stringBuilder, Set set) {
        if (object == null) {
            stringBuilder.append("null");
            return;
        }
        if (object instanceof String) {
            stringBuilder.append(object);
            return;
        }
        Class<?> class_ = object.getClass();
        if (class_.isArray()) {
            if (class_ == byte[].class) {
                stringBuilder.append(Arrays.toString((byte[])object));
            } else if (class_ == short[].class) {
                stringBuilder.append(Arrays.toString((short[])object));
            } else if (class_ == int[].class) {
                stringBuilder.append(Arrays.toString((int[])object));
            } else if (class_ == long[].class) {
                stringBuilder.append(Arrays.toString((long[])object));
            } else if (class_ == float[].class) {
                stringBuilder.append(Arrays.toString((float[])object));
            } else if (class_ == double[].class) {
                stringBuilder.append(Arrays.toString((double[])object));
            } else if (class_ == boolean[].class) {
                stringBuilder.append(Arrays.toString((boolean[])object));
            } else if (class_ == char[].class) {
                stringBuilder.append(Arrays.toString((char[])object));
            } else {
                String string = s.b(object);
                if (set.contains(string)) {
                    stringBuilder.append(a).append(string).append(b);
                } else {
                    set.add(string);
                    Object[] arrobject = (Object[])object;
                    stringBuilder.append("[");
                    boolean bl2 = true;
                    for (Object object2 : arrobject) {
                        if (bl2) {
                            bl2 = false;
                        } else {
                            stringBuilder.append(", ");
                        }
                        s.a(object2, stringBuilder, new HashSet(set));
                    }
                    stringBuilder.append("]");
                }
            }
        } else if (object instanceof Map) {
            String string = s.b(object);
            if (set.contains(string)) {
                stringBuilder.append(a).append(string).append(b);
            } else {
                set.add(string);
                Map map = (Map)object;
                stringBuilder.append("{");
                boolean bl3 = true;
                Iterator iterator = map.entrySet().iterator();
                while (iterator.hasNext()) {
                    Map.Entry entry;
                    Map.Entry entry2 = entry = iterator.next();
                    if (bl3) {
                        bl3 = false;
                    } else {
                        stringBuilder.append(", ");
                    }
                    Object k2 = entry2.getKey();
                    Object v2 = entry2.getValue();
                    s.a(k2, stringBuilder, new HashSet(set));
                    stringBuilder.append("=");
                    s.a(v2, stringBuilder, new HashSet(set));
                }
                stringBuilder.append("}");
            }
        } else if (object instanceof Collection) {
            String string = s.b(object);
            if (set.contains(string)) {
                stringBuilder.append(a).append(string).append(b);
            } else {
                set.add(string);
                Collection collection = (Collection)object;
                stringBuilder.append("[");
                boolean bl4 = true;
                for (Object e2 : collection) {
                    if (bl4) {
                        bl4 = false;
                    } else {
                        stringBuilder.append(", ");
                    }
                    s.a(e2, stringBuilder, new HashSet(set));
                }
                stringBuilder.append("]");
            }
        } else if (object instanceof Date) {
            Date date = (Date)object;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            stringBuilder.append(simpleDateFormat.format(date));
        } else {
            try {
                stringBuilder.append(object.toString());
            }
            catch (Throwable throwable) {
                stringBuilder.append(c);
                stringBuilder.append(s.b(object));
                stringBuilder.append(d);
                String string = throwable.getMessage();
                String string2 = throwable.getClass().getName();
                stringBuilder.append(string2);
                if (!string2.equals(string)) {
                    stringBuilder.append(e);
                    stringBuilder.append(string);
                }
                stringBuilder.append(f);
            }
        }
    }

    public static String b(Object object) {
        if (object == null) {
            return null;
        }
        return object.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(object));
    }

    public String toString() {
        return "ParameterizedMessage[messagePattern=" + this.l + ", stringArgs=" + Arrays.toString(this.m) + ", throwable=" + this.p + "]";
    }
}

