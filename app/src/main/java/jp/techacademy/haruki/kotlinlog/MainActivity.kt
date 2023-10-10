package jp.techacademy.haruki.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("kotlintest", "ログへの出力テスト")

        var num = 10
        Log.d("kotlintest", Integer.toString(num))

        num = 50
        Log.d("kotlintest", num.toString())

        val num1 = 10 + 5 - 2 * 4 / 2
        Log.d("kotlintest", "10+5-2*4/2=" + num1)

        val flag1 = true
        val flag2 = false
        Log.d("kotlintest", "fiag1 && flag2 =" + (flag1 && flag2))
        Log.d("kotlintest", "fiag1 || flag2 =" + (flag1 || flag2))

        val num2 = 10
        val num3 = 20
        Log.d("kotlintest", "num2<num3=" + (num2 < num3))

        Log.d("kotlintest", "ログへの出力テスト")

        num = 60

        if (num >= 90) {
            Log.d("kotlintest", "優")
        } else if (num >= 75) {
            Log.d("kotlintest", "良")
        } else if (num >= 60) {
            Log.d("kotlintest", "可")
        } else {
            Log.d("kotlintest", "不可")
        }

        val drink = 1

        when (drink) {
            0 -> {
                Log.d("kotlintest", "コーヒーを注文しました")
            }
            1 -> Log.d("kotlintest", "紅茶を注文しました")
            2 -> Log.d("kotlintest", "ミルクを注文しました")
            else -> Log.d("kotlintest", "オーダーミスです")
        }

        for (i in 1 until 6) {
            Log.d("kotlintest", "for文の" + i + "回目")
        }

        num = 1

        while (num < 6) {
            Log.d("kotlintest", "while文の" + num + "回目")
            num++
        }

        for (i in 1..3) {
            Log.d("kotlintest", "演算子の" + i + "の回")
        }
        for (i in 6 downTo 0 step 2)
            Log.d("kotlintest", "downTo関数の" + i + "の回")

        val points = arrayOf(10, 6, 15, 23, 17)

        for (i in points) {
            Log.d("kotlintest", i.toString())
        }

        val numA = 100
        val numB = 0
        var ans = 0

        try {
            ans = numA / numB
        } catch (e: java.lang.Exception) {
            Log.d("kotlintest", "0で割ろうとしました")

            Log.d("kotlintest", e.message.toString())
        } finally {
            Log.d("kotlintest", "ans=" + ans.toString())
        }


        val Dog =Dog("ポチ",3)

        Dog.say()
        Log.d("kotlintest","犬の名前は"+Dog.name+"です。")
        Log.d("kotlintest","犬の年齢は"+Dog.age+"歳です。")

        val dog2=Dog("ハチ",10)
        dog2.say()
        Log.d("kotlintest","犬の名前は"+dog2.name+"です。")
        Log.d("kotlintest","犬の年齢は"+dog2.age+"歳です。")

        val dog =Dog("ポチ",3)

        dog.move()


        dog.say()
        Log.d("kotlintest","犬の名前は"+dog.name+"です。")
        Log.d("kotlintest","犬の年齢は"+dog.age+"歳です")

        val bigdog=BigDog("ヨーゼフ",15)


        bigdog.say()
        Log.d("kotlintest","犬の名前は"+bigdog.name+"です。")
        Log.d("kotlintest","犬の年齢は"+bigdog.age+"歳です。")

        val Human=Human("はるき",22)

        Human.say()
        Log.d("kotlintest","私の名前は"+Human.name+"です。")
        Log.d("kotlintest","私の年齢は"+Human.age+"歳です。")


        Human.hobby()



    }

}
