GURSHARAN AI — Trial Android Project

Package: com.gursharan.ai
Version: 1.0 (trial)

This project is a build-ready Android prototype. The current app is a TRIAL UI only; it does not yet connect to LinkedIn, Upwork, browser automation, voice calls, or external AI services.

BUILD
-----
The project includes:
- codemagic.yaml for cloud APK builds
- gradlew launcher that uses Gradle 8.7 (or an installed Gradle)
- Java 17 build environment configuration
- Android debug APK output configuration

Expected APK:
app/build/outputs/apk/debug/app-debug.apk

The debug APK is installable for testing. A production release APK will require a release signing key later.

NEXT DEVELOPMENT PHASE
----------------------
1. AI Master Agent backend
2. Secure user authentication/session handling
3. LinkedIn Agent
4. Freelancing/Upwork Agent
5. Engineering Agent
6. Browser/Computer Agent
7. Files/Excel/PDF Agent
8. Voice Agent
9. Task Manager and job history
10. User approval controls for external actions

SECURITY
--------
Do not put passwords, OTPs, cookies, API secrets, or private keys in source files.
