package live.codemy.viewcomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val name = intent.getStringExtra(UserProfileType.KEY_NAME.name)
//        val age = intent.extras?.getInt(UserProfileType.KEY_AGE.name)
//        val isMale = intent.extras?.getBoolean(UserProfileType.KEY_IS_MALE.name)

//        val userProfileStruct: UserProfile = intent.getSerializableExtra("userProfileStruct") as UserProfile
        val userProfile: UserProfile = intent.getParcelableExtra("keyUserProfile") as UserProfile

//        txtData.text = "Name : $name, Age : $age, isMale : $isMale"
        txtData.text =
            "Name : ${userProfile.keyName}, Age : ${userProfile.keyAge}, isMale : ${userProfile.keyIsMale}"
    }
}
