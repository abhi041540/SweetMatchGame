# 🍬 SweetMatchGame — Merge, Score, Win!

**SweetMatchGame** is a fast-paced Java desktop game inspired by Candy Crush, built with JavaFX and Swing. Instead of candies, players merge numbered mango replicas to maximize their score within a one-minute challenge. Simple to play, hard to master — it's a sweet test of reflexes and strategy.

---

## 🎮 Game Features

- 🔢 **Merge Logic**  
  Combine two mangoes with the same number to create a new one with their sum (2 → 4 → 8 → 16 → ...).

- ⏱️ **One-Minute Timer**  
  You have 60 seconds to make the highest score possible — every move counts.

- 📈 **Real-Time Scoring**  
  Score updates dynamically as you merge mangoes.

- 🖥️ **JavaFX + Swing UI**  
  Smooth animations and responsive controls for a seamless experience.

- 🎉 **Result Summary**  
  End screen displays your final score and performance feedback.

---

## 🖼️ Visual Preview

### 🏁 Start Screen

![Start Interface](assets/v1 (1).png)  
*Launch the game and get ready to merge mangoes.*

---

### 🕹️ Gameplay Window

![Game Interface](assets/v1 (2).png)  
*Merge matching mangoes to climb the score ladder before time runs out.*

---

### 🏆 Result Screen

![Result Interface](assets/v1 (3).png)  
*Your final score is displayed with a clean summary.*

---

## 🛠️ Tech Stack

| Layer       | Technology     |
|-------------|----------------|
| UI          | JavaFX, Swing  |
| Logic       | Custom Merge Engine |
| Timer       | Java Threading |
| Graphics    | Java Canvas / Panels |

---

## 🚀 Getting Started

To run locally:

```bash
# Clone the repository
git clone https://github.com/abhi041540/SweetMatchGame.git
cd SweetMatchGame

# Compile and run
javac Main.java
java Main
