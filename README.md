<h4 align="center">
  <p>API Docker</p>
  
  <p>Application developed to practice docker and docker compose technologies.</p>
  
</h4>

<p align="center">
  <a href="#rocket-technologies">Technologies</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#information_source-how-to-use">How To Use</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
   <a href="#memo-documentation">Documentation</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
   <a href="#paperclips-references">References</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#thumbsup-how-to-contribute">How To Contribute</a>&nbsp;&nbsp;&nbsp;|&nbsp;&nbsp;&nbsp;
  <a href="#memo-license">License</a>
</p>

<p align="center">
<img alt="Collage" src="https://ik.imagekit.io/27ewoxssse/api-docker_tkN2keoz9.png?updatedAt=1633303276134"> 
</p>

## :rocket: Technologies

This project was developed with the following technologies:

- API:

  - [Java](https://www.oracle.com/br/java/)
  - [Spring Framework](https://spring.io/)
  - [Postgresql](https://www.postgresql.org/)
  
- Utils:

  - [Docker](https://www.docker.com/)
  - [Docker Compose](https://docs.docker.com/compose/)
 
## :information_source: How to use
To clone and run this application, you'll need [Git](https://git-scm.com), [Docker](https://www.docker.com/) and [Docker Compose](https://docs.docker.com/compose/) installed on your computer. From your command line:

```bash
# Clone this repository
$ git clone https://github.com/duduxs/api-docker

# Go into the repository
$ cd api-docker
```

To run with docker API + Postgres:

```bash
$ bash dockerStart.sh
```

To stop with docker API + Postgres:

```bash
$ bash dockerStop.sh
```

To run without docker (Only API):

```bash
$ bash start.sh
# PS¹: You'll need a postgres in container or installed in your device to start spring too
# PS²: You will need some env vars too, but you can get them in the DockerFile-Java archive, after that, create .env archive in root of the project and paste the env vars
```

Now access on your browser: http://localhost:8085


## :memo: Documentation

I also created a google doc file to write some annotations about docker that i collected by watching courses and reading articles from DevMedia and FullCycle, 
if you want to see, go <a href="https://docs.google.com/document/d/1ghe5jtUINeTH8Y8UEfUdSIieXQihMY3En0iVcaq3Bq0/edit#" target="_blank">here</a>
<br><br>
If you note some wrong or mistake in any case when you are reading the docs, don't hesitate to contact me.

## :paperclips: References

<a href="https://docs.google.com/document/d/1ghe5jtUINeTH8Y8UEfUdSIieXQihMY3En0iVcaq3Bq0/edit#" target="_blank">Google Doc</a><br>
<a href="https://github.com/Duduxs/api-docker-aws" target="_blank">Another Docker Project To Study</a><br>

## :thumbsup: How To Contribute

-  Make a fork;
-  Create a branch with your feature: `git checkout -b my-feature`;
-  Commit changes: `git commit -m 'feat: My new feature'`;
-  Make a push to your branch: `git push origin my-feature`.

## :memo: License
This project is under the MIT license. See the [LICENSE](https://github.com/Duduxs/api-docker/blob/main/LICENSE) for more information.

---

<h4 align="center">
    Made by Eduardo José 😆 <a href="https://www.linkedin.com/in/eduarddojose/" target="_blank">Contact me!</a>
</h4>
