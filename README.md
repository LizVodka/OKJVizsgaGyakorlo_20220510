# OKJVizsgaGyakorlo_20220510

Molnár Anna Aliz

### van-e git a gépen
git --version

### config
git config --global user.name "your_username"

git config --global user.email "your_email_address"

git config --global --list – ellenőrzés, hogy jól adtam-e meg

mappában cmd -> git init

### felnyomás
git remote add origin https://... -> link a repóhoz

git branch -M main

git push -u origin main

### HA ÍGY NEM MEGY
git add <file vagy folder neve>
  HA MINDENKIT FELRAKTAM

  git commit -m "description"

  git push origin main
  
As a shortcut, you can add all local changes to staging and commit them with one command:
  git commit -a -m "comment"
  
git pull origin main --allow-unrelated-histories
