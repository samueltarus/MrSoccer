<%--
  Created by IntelliJ IDEA.
  User: Mullatoez
  Date: 9/14/2021
  Time: 10:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https:kit.fontawesome.com/3da1a747b2.js"></script>
    <link href="https://fonts.googleapis.com/css?family=Catamaran&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/simplelightbox.css">
    <link rel="stylesheet" href="css/style.css">
    <title>Kimkim-It's me your boy Kim</title>

    <style>
        :root {
            --primary-color: #333;
            --secondary-color: #444;
            --overlay-color: rgba(0,0,0,3);
        }

        *{
            box-sizing: border-box;
            margin: 0;
            padding: 0;
        }

        body {
            font-family: 'Catamaran',sans-serif;
            line-height: 1.6;
            color: #333;
            font-size: 1.1rem;
        }

        h1,h2,h3,h4 {
            line-height: 1.3;
        }

        a {
            color: var(--secondary-color);
            text-decoration: none;
        }

        ul {
            list-style: none;
        }

        img{
            width: 100%;
        }

        .container {
            max-width: 1100px;
            margin: auto;
            overflow: hidden;
            padding: 0 2rem;
        }
        .navbar {
            font-size: 1.2rem;
            padding-top: 0.3rem;
            padding-bottom: 0.3rem;
        }

        .navbar .container{
            display: grid;
            grid-template-columns: repeat(2,1fr);
        }

        .navbar .log0 {
            font-size: 2rem;

        }

        .navbar .nav {
            justify-self: flex-end;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .navbar .nav a{
            padding: 0 1rem;
        }

        .navbar .nav a:hover {
            color: #555;
        }
        .section-a {
            margin: 2rem 0;
        }

        .section-a .container {
            display: grid;
            grid-template-columns: repeat(2,1fr);
            grid-gap: 3rem;
            align-items: center;
            justify-content: center;
        }

        .section-a h1{
            font-size:4rem;
            color: var(--primary-color);
        }

        .section-a p{
            margin: 1rem 0;
        }

        /*Section B */
        .section-b {
            position: relative;
            background: url("bg.jpg") no-repeat bottom center/cover;
            height: 600px;
        }

        .section-b-inner {
            color: rgb(17, 17, 17);
            height: 100%;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            text-align: center;
            margin: auto;
            max-width: 860px;
            padding: 5rem 0;
        }

        .section-b-inner h3{
            font-size: 2rem;
        }

        .section-b-inner h2{
            font-size: 5rem;
            margin-top: 1rem;
        }

        .section-b-inner p{
            font-size: 1.5rem;
            margin-top: 1rem;
        }

        .section-c .gallery {
            display: grid;
            grid-template-columns: repeat(5,1fr);
        }

        .section-c .gallery a:first-child {
            grid-row: 1/3;
            grid-column: 1/3;
        }
        /*
        .section-c .gallery a:nth-child(2) {
            grid-column: 3/5;
        }

        .section-c .gallery img, .section-c .gallery a {
            width: 100%;
            height: 100%;
        }

        */

        /*footer*/

        .section-footer{
            background: var(--primary-color);
            color: #fff;
            padding: 4rem 0;
        }

        .section-footer .container {
            display:grid;
            grid-template-columns: repeat(4,1fr);
            grid-gap: 1rem;
        }

        .section-footer h2 {
            font-size: 2rem;
            margin-bottom: 1rem;
        }

        .section-footer h3 {
            scroll-margin-bottom: 0.7rem;
        }

        .section-footer a {
            line-height: 1.9;
            color: #ccc;
        }

        .section-footer a > i {
            color:#555;
            margin-right: 0.5rem;
        }

        /*Email form*/
        .email-form{
            width: 100%;
            display: inline-block;
            background-color: transparent;
            position: relative;
            border-radius: 20px;
            line-height: 0;
            margin-top: 1rem;
        }

        .email-form .form-control {
            display: inline-block;
            border: 0;
            outline: 0;
            font-size: 1rem;
            color: #ddd;
            background-color: transparent;
            font-family: inherit;
            margin: 0;
            padding: 0 3rem 0 1.5rem;
            width: 100%;
            height: 45px;
            border-radius: 20px;
        }

        .email-form .submit {
            display: inline-block;
            position: absolute;
            top: 0;
            right: 0;
            width: 45px;
            height: 45px;
            background-color: #eee;
            font-size: 1rem;
            text-align: center;
            margin: 0;
            padding: 0;
            outline: 0;
            border: 0;
            color: #333;
            cursor: pointer;
            border-radius: 0 20px 20px 0;
        }
        /* Utilities */

        .btn {
            display: inline-block;
            background: var(--primary-color);
            color: #fff;
            padding: 0.8rem 1.5rem;
            border: none;
            cursor: pointer;
            font-size: 1.1rem;
            border-radius: 30px;
        }

        .btn:hover {
            background: var(--secondary-color);
        }

        .overlay {
            position: absolute;
            top: 0;
            left: 0;
            height: 100%;
            width: 100%;
            background-color: var(--overlay-color)
        }

        /*Media Queries*/
        @media(max-width: 700px) {
            .section-a .container {
                grid-template-columns: 1fr;
                text-align: center;
            }

            .section-a .container div:first-child {
                order: 2;
            }


            .section-a .container div:last-child {
                order: -1;
            }

            .section-a .img {
                width: 80%;
                margin: auto;
            }
            .section-b-inner h2 {
                font-size: 3.5rem;
            }

            .section-c .gallery{
                grid-template-columns: repeat(3,1fr);
            }
            .section-c .gallery a:first-child{
                grid-row: 1/1;
                grid-column: 1/1;
            }

            .section-c.gallery a:nth-child(2){
                grid-row: 2/2;
                grid-column: 2/4;
            }
            .section-c.gallery a:last-child{
                display: none;
            }

            .section-footer{
                padding: 2rem 0;
            }

            .section-footer .container{
                grid-template-columns: 1fr;
                text-align: center;
            }

            .section-footer div:nth-child(2),
            .section-footer div:nth-child(3)
            {
                display: none;
            }


        }
    </style>
</head>

<body id="home">
<nav class="navbar">
    <div class="container">
        <h1 class="logo"><a href="/MrSoccer/home">MrSoccer Management System</a></h1>
        <ul class="nav">
            <li><a href="/MrSoccer/clubs">Clubs</a></li>
            <li><a href="/MrSoccer/players">Players</a></li>
            <li><a href="/MrSoccer/managers">Managers</a></li>
            <li><a href="/MrSoccer/login">Sign In</a></li>
        </ul>
    </div>
</nav>

<!-- Showcase -->
<section class="section-a">

    <div class="container">
        <div>
            <h3>Trending news</h3>
            <h5>Shearer: Did you expect anything else from Ronaldo?</h5>
            <p>
                Alan Shearer says Cristiano Ronaldo's goalscoring return to Manchester United
                was nothing more than he and many others expected...
            </p>
            <a href="#" class="btn">Read More</a>
        </div>
        <img src="bg.jpg" alt="" />
    </div>
</section>

<!-- Footer -->
<footer class="section-footer">
    <div class="container">
        <div>
            <h2>Follow us on Social Media</h2>
            <a href="http://twitter.com/mullatoez">
                <i class="fab fa-twitter fa-2x"></i>
            </a>
            <a href="http://instagram.com/mullatoez">
                <i class="fab fa-instagram fa-2x"></i>
            </a>
            <a href="https://www.youtube.com/channel/UCqzNRcE2KEsBHLaVdinakZg">
                <i class="fab fa-youtube fa-2x"></i>
            </a>
            <a href="http://github.com/mullatoez">
                <i class="fab fa-github fa-2x"></i>
            </a>
        </div>

        <div>
            <ul>
                <li><a href="/MrSoccer/clubs">Clubs</a> </li>
                <li><a href="/MrSoccer/players">Players</a> </li>
                <li><a href="/MrSoccer/managers">Managers</a> </li>
                <li><a href="/MrSoccer/home">Terms of Service</a> </li>
            </ul>
        </div>
        <div>
            <h3>Top News</h3>

            <ul>
                <li><a href="#">Lukaku's new 'home'</a></li>
                <li><a href="#">CR7 Magic</a></li>
                <li><a href="#">Ponderous Arsenal</a></li>
                <li><a href="#">Daniel Farke's fault?</a></li>
            </ul>
        </div>
        <div>
            <h3>Subscribe</h3>
            <p>Wanna get intouch with the developer?Just use your e-mail below</p>
            <form name="email-form" method="POST" data-netlify="true">
                <div class="email-form">
                        <span class="form-control-wrap">
                            <input type="email" name="email" id="email" size="40" class="form-control"
                                   placeholder="Email">
                        </span>
                    <button type="submit" class="form-control submit">
                        <i class="fas fa-chevron-right"></i>

                    </button>
                </div>
            </form>
        </div>

    </div>
</footer>

</body>

</html>