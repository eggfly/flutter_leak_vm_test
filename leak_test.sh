for ((;;));do
    adb shell am start -W com.example.flutter_leak_vm_test/.MainFlutterActivity
    sleep 0.2
    adb shell input keyevent 4
    sleep 0.3
done
