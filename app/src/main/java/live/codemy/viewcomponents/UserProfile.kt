package live.codemy.viewcomponents

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


/**     Code with ❤
╔════════════════════════════╗
║  Created by Gökhan ÖZTÜRK  ║
╠════════════════════════════╣
║ GokhanOzturk@AndroidEdu.IO ║
╠════════════════════════════╣
║     15/02/2020 - 22:10     ║
╚════════════════════════════╝
 */

@Parcelize
data class UserProfile(val keyName: String, val keyAge: Int, val keyIsMale: Boolean) : Parcelable {
//    constructor(parcel: Parcel) : this(
//        parcel.readString()!!,
//        parcel.readInt(),
//        parcel.readByte() != 0.toByte()
//    ) {
//    }
//
//    override fun writeToParcel(parcel: Parcel, flags: Int) {
//        parcel.writeString(keyName)
//        parcel.writeInt(keyAge)
//        parcel.writeByte(if (keyIsMale) 1 else 0)
//    }
//
//    override fun describeContents(): Int {
//        return 0
//    }
//
//    companion object CREATOR : Parcelable.Creator<UserProfile> {
//        override fun createFromParcel(parcel: Parcel): UserProfile {
//            return UserProfile(parcel)
//        }
//
//        override fun newArray(size: Int): Array<UserProfile?> {
//            return arrayOfNulls(size)
//        }
//    }
}