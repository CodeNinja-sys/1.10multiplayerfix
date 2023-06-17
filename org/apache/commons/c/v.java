/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.c.ao;
import org.apache.commons.c.c;

public class v {
    private static final String a = "null elements not permitted";
    private static final String b = "Cannot store %s %s values in %s bits";
    private static final String c = "%s does not seem to be an Enum type";
    private static final String d = "EnumClass must be defined.";

    public static Map a(Class class_) {
        LinkedHashMap<String, Enum> linkedHashMap = new LinkedHashMap<String, Enum>();
        for (Enum enum_ : (Enum[])class_.getEnumConstants()) {
            linkedHashMap.put(enum_.name(), enum_);
        }
        return linkedHashMap;
    }

    public static List b(Class class_) {
        return new ArrayList(Arrays.asList(class_.getEnumConstants()));
    }

    public static boolean a(Class class_, String string) {
        if (string == null) {
            return false;
        }
        try {
            Enum.valueOf(class_, string);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    public static Enum b(Class class_, String string) {
        if (string == null) {
            return null;
        }
        try {
            return Enum.valueOf(class_, string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public static long a(Class class_, Iterable iterable) {
        v.c(class_);
        ao.a((Object)iterable);
        long l2 = 0L;
        for (Enum enum_ : iterable) {
            ao.a(enum_ != null, a, new Object[0]);
            l2 |= (long)(1 << enum_.ordinal());
        }
        return l2;
    }

    public static long[] b(Class class_, Iterable iterable) {
        v.d(class_);
        ao.a((Object)iterable);
        EnumSet<Enum> enumSet = EnumSet.noneOf(class_);
        for (Object object : iterable) {
            ao.a(object != null, a, new Object[0]);
            enumSet.add((Enum)object);
        }
        Object object = new long[(((Enum[])class_.getEnumConstants()).length - 1) / 64 + 1];
        for (Enum enum_ : enumSet) {
            Object object2 = object;
            int n2 = enum_.ordinal() / 64;
            object2[n2] = object2[n2] | (long)(1 << enum_.ordinal() % 64);
        }
        org.apache.commons.c.c.c((long[])object);
        return object;
    }

    public static long a(Class class_, Enum ... arrenum) {
        ao.b(arrenum);
        return v.a(class_, Arrays.asList(arrenum));
    }

    public static long[] b(Class class_, Enum ... arrenum) {
        v.d(class_);
        ao.b(arrenum);
        EnumSet<Enum> enumSet = EnumSet.noneOf(class_);
        Collections.addAll(enumSet, arrenum);
        long[] arrl = new long[(((Enum[])class_.getEnumConstants()).length - 1) / 64 + 1];
        for (Enum enum_ : enumSet) {
            int n2 = enum_.ordinal() / 64;
            arrl[n2] = arrl[n2] | (long)(1 << enum_.ordinal() % 64);
        }
        org.apache.commons.c.c.c(arrl);
        return arrl;
    }

    public static EnumSet a(Class class_, long l2) {
        v.c(class_).getEnumConstants();
        return v.a(class_, new long[]{l2});
    }

    public static EnumSet a(Class class_, long ... arrl) {
        EnumSet<Enum> enumSet = EnumSet.noneOf(v.d(class_));
        long[] arrl2 = org.apache.commons.c.c.a((long[])ao.a((Object)arrl));
        org.apache.commons.c.c.c(arrl2);
        for (Enum enum_ : (Enum[])class_.getEnumConstants()) {
            int n2 = enum_.ordinal() / 64;
            if (n2 >= arrl2.length || (arrl2[n2] & (long)(1 << enum_.ordinal() % 64)) == 0L) continue;
            enumSet.add(enum_);
        }
        return enumSet;
    }

    private static Class c(Class class_) {
        Enum[] arrenum = (Enum[])v.d(class_).getEnumConstants();
        ao.a(arrenum.length <= 64, b, new Object[]{arrenum.length, class_.getSimpleName(), 64});
        return class_;
    }

    private static Class d(Class class_) {
        ao.a((Object)class_, d, new Object[0]);
        ao.a(class_.isEnum(), c, new Object[]{class_});
        return class_;
    }
}

