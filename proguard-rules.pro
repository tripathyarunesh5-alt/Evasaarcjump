# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to the
# getDefaultProguardFile('proguard-android-optimize.txt') from the Android Gradle plugin.

# Keep the MainActivity so it doesn’t get removed
-keep class com.evasa.arcjump.MainActivity { *; }
