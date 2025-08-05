<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:gravity="center"
    android:padding="20dp"
    android:background="#E8F5E8">

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Second Activity"
        android:textSize="28sp"
        android:textStyle="bold"
        android:textColor="#2E7D32"
        android:layout_marginBottom="30dp" />

    <TextView
        android:id="@+id/tvUserName"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Welcome User!"
        android:textSize="20sp"
        android:textColor="#388E3C"
        android:layout_marginBottom="20dp"
        android:textAlignment="center" />

    <TextView
        android:id="@+id/tvMessage"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="No message received"
        android:textSize="16sp"
        android:textColor="#4CAF50"
        android:layout_marginBottom="40dp"
        android:textAlignment="center"
        android:padding="10dp"
        android:background="#C8E6C9"
        android:layout_marginHorizontal="20dp" />

    <Button
        android:id="@+id/btnBack"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Go Back to Main"
        android:textSize="18sp"
        android:paddingHorizontal="30dp"
        android:paddingVertical="15dp"
        android:backgroundTint="#FF9800"
        android:textColor="@android:color/white"
        android:layout_marginBottom="20dp" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Successfully navigated using Intent!"
        android:textSize="14sp"
        android:textColor="#666666"
        android:textAlignment="center" />

</LinearLayout>

