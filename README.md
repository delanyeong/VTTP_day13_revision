# Reference 

## Maven Command

1. mvnw

2. mvnw compile

3. mvnw clean package

4. mvnw spring-boot:run

5. mvnw clean package spring:boot-run

6. mvnw spring-boot:run -Dspring-boot.run.arguments="--port=3000"

7. mvnw spring-boot:run -Dspring-boot.run.arguments="--port3000 --dataDir=c:/data"

8. mvnw clean test

## Git Command

1. git init (initialize a local repo, doesn't link to remote yet)
* <create a git remote repo>

2. git remote add origin https://github.com/<username>/reponame>.git

3. git add * (add files) / git add . (but must becareful which path you are on)

4. git status (to check files that are going to commit into local repo)

5. git commit -m "<commit message>" (commit new/updated files to local repo)

6. git push -u origin master (create a master branch in github and push the code to github master branch)
* <don't develop in master branch - final/latest working baseline>

7. git checkout -b develop main (clone a copy from main to develop branch locally)
* -b is to create new branch

8. git push -u origin develop (push from local develop branch to github develop branch)

9. git checkout <branch name> (to switch between branches)

10. git branch -a (show all local branches and remote branch references)

11. git branch (show all local branches)
* <always develop in develop branch>

12. git add *

13. git commit -m "<commit changes>"

14. git push -u origin develop (push code on local develop branch to github develop branch)

15. git checkout main

16. git merge develop (after changes in develop branch are complete with errors, in main branch, merge changes from develop branch)

17. git push -u origin main (in main branch to push merged changes from develop branch to github main branch)

## Deploy to Heroku

1. Create/use an exisiting heroku account

2. On your project root, you need a system.properties file.

3. Put the following line in system.properties file.
* java.runtime.version=18

4. git add *

5. git commit -m "added/updated system.properties"

6. git push -u origin main

7. heroku login (in your terminal window/command prompt in the project root directory)

8. heroku apps:create

9. git remote -v (see all remote branches. you should see reference URL to heroku)

10. git push -u heroku main