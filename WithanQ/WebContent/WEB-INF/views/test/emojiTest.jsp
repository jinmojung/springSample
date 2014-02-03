<%@ page contentType="text/html; charset=utf-8"%>
<jsp:directive.include file="/WEB-INF/views/include/taglibs.jsp"/>
<html>
<head>
<title>loginPage</title>
<style type="text/css">
		@font-face {font-family: phantom; src:url(../font/EmojiSymbols-Regular.woff);}
		.symbola {font-family: phantom;font-size: 30pt; color: black;}
		</style>
</head>
<body>
	<table class="table table-bordered table-striped">
                <thead>
                    <tr>
                        <th>Native&nbsp;<a href="#note1" title="Note about native rendering of Emoji characters">[1]</a></th>
                        <th>Apple&nbsp;<a href="#note2" title="See copyright notice">[2]</a></th>
                        <th>Android&nbsp;<a href="#note3" title="See copyright notice">[3]</a></th>
                        <th>Symbola&nbsp;<a href="#note4" title="See font information">[4]</a></th>
                        <th>CodeTest&nbsp;<a href="#note5" title="See credit">[5]</a></th>
                        <th>Unicode</th>
                        <th>Bytes <small>(UTF-8)</small></th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                     
                    <tr id="emoji-1f601">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F601"><span class="emoji">😁</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f601" href="#emoji-modal" title="U+1F601">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f601.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F601"><span class="emoji android">😁</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F601"><span class="emoji symbola">😁</span></a>
                        </td>
                        <td class="preview theme-phantom">
                        <a class="phantom" href="#emoji-modal" title="U+1F601"><span class="symbola">${unicode}</span></a>
                             <a class="phantom" href="#emoji-modal" title="U+1F601"><span class="symbola">${byteStringTest}</span></a>
                        </td> 
                        <td class="code">U+1F601</td>
                        <td class="code">\xF0\x9F\x98\x81</td>
                        <td class="name">GRINNING FACE WITH SMILING EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f602">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F602"><span class="emoji">😂</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f602" href="#emoji-modal" title="U+1F602">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f602.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F602"><span class="emoji android">😂</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F602"><span class="emoji symbola">😂</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f602" href="#emoji-modal" title="face_with_tear_of_joy">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f602.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F602</td>
                        <td class="code">\xF0\x9F\x98\x82</td>
                        <td class="name">FACE WITH TEARS OF JOY</td>
                    </tr>
                     
                    <tr id="emoji-1f603">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F603"><span class="emoji">😃</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f603" href="#emoji-modal" title="U+1F603">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f603.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F603"><span class="emoji android">😃</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F603"><span class="emoji symbola">😃</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f603" href="#emoji-modal" title="smiley">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f603.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F603</td>
                        <td class="code">\xF0\x9F\x98\x83</td>
                        <td class="name">SMILING FACE WITH OPEN MOUTH</td>
                    </tr>
                     
                    <tr id="emoji-1f604">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F604"><span class="emoji">😄</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f604" href="#emoji-modal" title="U+1F604">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f604.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F604"><span class="emoji android">😄</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F604"><span class="emoji symbola">😄</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f604" href="#emoji-modal" title="smile">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f604.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F604</td>
                        <td class="code">\xF0\x9F\x98\x84</td>
                        <td class="name">SMILING FACE WITH OPEN MOUTH AND SMILING EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f605">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F605"><span class="emoji">😅</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f605" href="#emoji-modal" title="U+1F605">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f605.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F605"><span class="emoji android">😅</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F605"><span class="emoji symbola">😅</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f605" href="#emoji-modal" title="sweat_smile">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f605.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F605</td>
                        <td class="code">\xF0\x9F\x98\x85</td>
                        <td class="name">SMILING FACE WITH OPEN MOUTH AND COLD SWEAT</td>
                    </tr>
                     
                    <tr id="emoji-1f606">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F606"><span class="emoji">😆</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f606" href="#emoji-modal" title="U+1F606">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f606.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F606"><span class="emoji android">😆</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F606"><span class="emoji symbola">😆</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f606" href="#emoji-modal" title="laughing">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f606.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F606</td>
                        <td class="code">\xF0\x9F\x98\x86</td>
                        <td class="name">SMILING FACE WITH OPEN MOUTH AND TIGHTLY-CLOSED EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f609">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F609"><span class="emoji">😉</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f609" href="#emoji-modal" title="U+1F609">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f609.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F609"><span class="emoji android">😉</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F609"><span class="emoji symbola">😉</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f609" href="#emoji-modal" title="wink">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f609.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F609</td>
                        <td class="code">\xF0\x9F\x98\x89</td>
                        <td class="name">WINKING FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f60a">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F60A"><span class="emoji">😊</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f60a" href="#emoji-modal" title="U+1F60A">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f60a.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F60A"><span class="emoji android">😊</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F60A"><span class="emoji symbola">😊</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f60a" href="#emoji-modal" title="blush">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f60a.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F60A</td>
                        <td class="code">\xF0\x9F\x98\x8A</td>
                        <td class="name">SMILING FACE WITH SMILING EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f60b">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F60B"><span class="emoji">😋</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f60b" href="#emoji-modal" title="U+1F60B">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f60b.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F60B"><span class="emoji android">😋</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F60B"><span class="emoji symbola">😋</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f60b" href="#emoji-modal" title="face_savouring_delicious_food">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f60b.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F60B</td>
                        <td class="code">\xF0\x9F\x98\x8B</td>
                        <td class="name">FACE SAVOURING DELICIOUS FOOD</td>
                    </tr>
                     
                    <tr id="emoji-1f60c">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F60C"><span class="emoji">😌</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f60c" href="#emoji-modal" title="U+1F60C">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f60c.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F60C"><span class="emoji android">😌</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F60C"><span class="emoji symbola">😌</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f60c" href="#emoji-modal" title="relieved">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f60c.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F60C</td>
                        <td class="code">\xF0\x9F\x98\x8C</td>
                        <td class="name">RELIEVED FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f60d">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F60D"><span class="emoji">😍</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f60d" href="#emoji-modal" title="U+1F60D">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f60d.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F60D"><span class="emoji android">😍</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F60D"><span class="emoji symbola">😍</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f60d" href="#emoji-modal" title="heart_eyes">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f60d.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F60D</td>
                        <td class="code">\xF0\x9F\x98\x8D</td>
                        <td class="name">SMILING FACE WITH HEART-SHAPED EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f60f">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F60F"><span class="emoji">😏</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f60f" href="#emoji-modal" title="U+1F60F">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f60f.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F60F"><span class="emoji android">😏</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F60F"><span class="emoji symbola">😏</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f60f" href="#emoji-modal" title="smirk">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f60f.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F60F</td>
                        <td class="code">\xF0\x9F\x98\x8F</td>
                        <td class="name">SMIRKING FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f612">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F612"><span class="emoji">😒</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f612" href="#emoji-modal" title="U+1F612">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f612.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F612"><span class="emoji android">😒</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F612"><span class="emoji symbola">😒</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f612" href="#emoji-modal" title="unamused">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f612.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F612</td>
                        <td class="code">\xF0\x9F\x98\x92</td>
                        <td class="name">UNAMUSED FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f613">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F613"><span class="emoji">😓</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f613" href="#emoji-modal" title="U+1F613">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f613.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F613"><span class="emoji android">😓</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F613"><span class="emoji symbola">😓</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f613" href="#emoji-modal" title="sweat">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f613.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F613</td>
                        <td class="code">\xF0\x9F\x98\x93</td>
                        <td class="name">FACE WITH COLD SWEAT</td>
                    </tr>
                     
                    <tr id="emoji-1f614">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F614"><span class="emoji">😔</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f614" href="#emoji-modal" title="U+1F614">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f614.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F614"><span class="emoji android">😔</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F614"><span class="emoji symbola">😔</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f614" href="#emoji-modal" title="pensive_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f614.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F614</td>
                        <td class="code">\xF0\x9F\x98\x94</td>
                        <td class="name">PENSIVE FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f616">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F616"><span class="emoji">😖</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f616" href="#emoji-modal" title="U+1F616">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f616.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F616"><span class="emoji android">😖</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F616"><span class="emoji symbola">😖</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite" href="#">
                                    &nbsp;                                    
                                </a> 
                        </td> 
                        <td class="code">U+1F616</td>
                        <td class="code">\xF0\x9F\x98\x96</td>
                        <td class="name">CONFOUNDED FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f618">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F618"><span class="emoji">😘</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f618" href="#emoji-modal" title="U+1F618">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f618.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F618"><span class="emoji android">😘</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F618"><span class="emoji symbola">😘</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f618" href="#emoji-modal" title="kissing_heart">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f618.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F618</td>
                        <td class="code">\xF0\x9F\x98\x98</td>
                        <td class="name">FACE THROWING A KISS</td>
                    </tr>
                     
                    <tr id="emoji-1f61a">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F61A"><span class="emoji">😚</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f61a" href="#emoji-modal" title="U+1F61A">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f61a.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F61A"><span class="emoji android">😚</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F61A"><span class="emoji symbola">😚</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f61a" href="#emoji-modal" title="kissing_closed_eyes">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f61a.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F61A</td>
                        <td class="code">\xF0\x9F\x98\x9A</td>
                        <td class="name">KISSING FACE WITH CLOSED EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f61c">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F61C"><span class="emoji">😜</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f61c" href="#emoji-modal" title="U+1F61C">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f61c.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F61C"><span class="emoji android">😜</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F61C"><span class="emoji symbola">😜</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f61c" href="#emoji-modal" title="stuck_out_tongue_winking_eye">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f61c.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F61C</td>
                        <td class="code">\xF0\x9F\x98\x9C</td>
                        <td class="name">FACE WITH STUCK-OUT TONGUE AND WINKING EYE</td>
                    </tr>
                     
                    <tr id="emoji-1f61d">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F61D"><span class="emoji">😝</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f61d" href="#emoji-modal" title="U+1F61D">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f61d.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F61D"><span class="emoji android">😝</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F61D"><span class="emoji symbola">😝</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f61d" href="#emoji-modal" title="stuck_out_tongue_closed_eyes">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f61d.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F61D</td>
                        <td class="code">\xF0\x9F\x98\x9D</td>
                        <td class="name">FACE WITH STUCK-OUT TONGUE AND TIGHTLY-CLOSED EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f61e">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F61E"><span class="emoji">😞</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f61e" href="#emoji-modal" title="U+1F61E">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f61e.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F61E"><span class="emoji android">😞</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F61E"><span class="emoji symbola">😞</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f61e" href="#emoji-modal" title="disappointed_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f61e.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F61E</td>
                        <td class="code">\xF0\x9F\x98\x9E</td>
                        <td class="name">DISAPPOINTED FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f620">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F620"><span class="emoji">😠</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f620" href="#emoji-modal" title="U+1F620">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f620.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F620"><span class="emoji android">😠</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F620"><span class="emoji symbola">😠</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f620" href="#emoji-modal" title="angry_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f620.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F620</td>
                        <td class="code">\xF0\x9F\x98\xA0</td>
                        <td class="name">ANGRY FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f621">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F621"><span class="emoji">😡</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f621" href="#emoji-modal" title="U+1F621">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f621.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F621"><span class="emoji android">😡</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F621"><span class="emoji symbola">😡</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f621" href="#emoji-modal" title="pouting_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f621.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F621</td>
                        <td class="code">\xF0\x9F\x98\xA1</td>
                        <td class="name">POUTING FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f622">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F622"><span class="emoji">😢</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f622" href="#emoji-modal" title="U+1F622">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f622.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F622"><span class="emoji android">😢</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F622"><span class="emoji symbola">😢</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f622" href="#emoji-modal" title="crying_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f622.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F622</td>
                        <td class="code">\xF0\x9F\x98\xA2</td>
                        <td class="name">CRYING FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f623">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F623"><span class="emoji">😣</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f623" href="#emoji-modal" title="U+1F623">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f623.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F623"><span class="emoji android">😣</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F623"><span class="emoji symbola">😣</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f623" href="#emoji-modal" title="persevering_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f623.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F623</td>
                        <td class="code">\xF0\x9F\x98\xA3</td>
                        <td class="name">PERSEVERING FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f624">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F624"><span class="emoji">😤</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f624" href="#emoji-modal" title="U+1F624">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f624.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F624"><span class="emoji android">😤</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F624"><span class="emoji symbola">😤</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f624" href="#emoji-modal" title="face_with_look_of_triumph">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f624.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F624</td>
                        <td class="code">\xF0\x9F\x98\xA4</td>
                        <td class="name">FACE WITH LOOK OF TRIUMPH</td>
                    </tr>
                     
                    <tr id="emoji-1f625">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F625"><span class="emoji">😥</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f625" href="#emoji-modal" title="U+1F625">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f625.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F625"><span class="emoji android">😥</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F625"><span class="emoji symbola">😥</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f625" href="#emoji-modal" title="disappointed_but_relieved_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f625.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F625</td>
                        <td class="code">\xF0\x9F\x98\xA5</td>
                        <td class="name">DISAPPOINTED BUT RELIEVED FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f628">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F628"><span class="emoji">😨</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f628" href="#emoji-modal" title="U+1F628">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f628.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F628"><span class="emoji android">😨</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F628"><span class="emoji symbola">😨</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f628" href="#emoji-modal" title="fearful_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f628.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F628</td>
                        <td class="code">\xF0\x9F\x98\xA8</td>
                        <td class="name">FEARFUL FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f629">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F629"><span class="emoji">😩</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f629" href="#emoji-modal" title="U+1F629">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f629.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F629"><span class="emoji android">😩</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F629"><span class="emoji symbola">😩</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f629" href="#emoji-modal" title="weary_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f629.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F629</td>
                        <td class="code">\xF0\x9F\x98\xA9</td>
                        <td class="name">WEARY FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f62a">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F62A"><span class="emoji">😪</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f62a" href="#emoji-modal" title="U+1F62A">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f62a.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F62A"><span class="emoji android">😪</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F62A"><span class="emoji symbola">😪</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite" href="#">
                                    &nbsp;                                    
                                </a> 
                        </td> 
                        <td class="code">U+1F62A</td>
                        <td class="code">\xF0\x9F\x98\xAA</td>
                        <td class="name">SLEEPY FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f62b">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F62B"><span class="emoji">😫</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f62b" href="#emoji-modal" title="U+1F62B">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f62b.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F62B"><span class="emoji android">😫</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F62B"><span class="emoji symbola">😫</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite" href="#">
                                    &nbsp;                                    
                                </a> 
                        </td> 
                        <td class="code">U+1F62B</td>
                        <td class="code">\xF0\x9F\x98\xAB</td>
                        <td class="name">TIRED FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f62d">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F62D"><span class="emoji">😭</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f62d" href="#emoji-modal" title="U+1F62D">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f62d.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F62D"><span class="emoji android">😭</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F62D"><span class="emoji symbola">😭</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f62d" href="#emoji-modal" title="loudly_crying_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f62d.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F62D</td>
                        <td class="code">\xF0\x9F\x98\xAD</td>
                        <td class="name">LOUDLY CRYING FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f630">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F630"><span class="emoji">😰</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f630" href="#emoji-modal" title="U+1F630">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f630.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F630"><span class="emoji android">😰</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F630"><span class="emoji symbola">😰</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f630" href="#emoji-modal" title="face_with_open_mouth_and_cold_sweat">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f630.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F630</td>
                        <td class="code">\xF0\x9F\x98\xB0</td>
                        <td class="name">FACE WITH OPEN MOUTH AND COLD SWEAT</td>
                    </tr>
                     
                    <tr id="emoji-1f631">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F631"><span class="emoji">😱</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f631" href="#emoji-modal" title="U+1F631">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f631.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F631"><span class="emoji android">😱</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F631"><span class="emoji symbola">😱</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite" href="#">
                                    &nbsp;                                    
                                </a> 
                        </td> 
                        <td class="code">U+1F631</td>
                        <td class="code">\xF0\x9F\x98\xB1</td>
                        <td class="name">FACE SCREAMING IN FEAR</td>
                    </tr>
                     
                    <tr id="emoji-1f632">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F632"><span class="emoji">😲</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f632" href="#emoji-modal" title="U+1F632">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f632.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F632"><span class="emoji android">😲</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F632"><span class="emoji symbola">😲</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f632" href="#emoji-modal" title="astonished_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f632.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F632</td>
                        <td class="code">\xF0\x9F\x98\xB2</td>
                        <td class="name">ASTONISHED FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f633">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F633"><span class="emoji">😳</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f633" href="#emoji-modal" title="U+1F633">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f633.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F633"><span class="emoji android">😳</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F633"><span class="emoji symbola">😳</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f633" href="#emoji-modal" title="flushed">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f633.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F633</td>
                        <td class="code">\xF0\x9F\x98\xB3</td>
                        <td class="name">FLUSHED FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f635">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F635"><span class="emoji">😵</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f635" href="#emoji-modal" title="U+1F635">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f635.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F635"><span class="emoji android">😵</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F635"><span class="emoji symbola">😵</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f635" href="#emoji-modal" title="dizzy_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f635.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F635</td>
                        <td class="code">\xF0\x9F\x98\xB5</td>
                        <td class="name">DIZZY FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f637">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F637"><span class="emoji">😷</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f637" href="#emoji-modal" title="U+1F637">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f637.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F637"><span class="emoji android">😷</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F637"><span class="emoji symbola">😷</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f637" href="#emoji-modal" title="face_with_medical_mask">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f637.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F637</td>
                        <td class="code">\xF0\x9F\x98\xB7</td>
                        <td class="name">FACE WITH MEDICAL MASK</td>
                    </tr>
                     
                    <tr id="emoji-1f638">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F638"><span class="emoji">😸</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f638" href="#emoji-modal" title="U+1F638">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f638.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F638"><span class="emoji android">😸</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F638"><span class="emoji symbola">😸</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f638" href="#emoji-modal" title="grinning_cat_face_with_smiling_eyes">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f638.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F638</td>
                        <td class="code">\xF0\x9F\x98\xB8</td>
                        <td class="name">GRINNING CAT FACE WITH SMILING EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f639">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F639"><span class="emoji">😹</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f639" href="#emoji-modal" title="U+1F639">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f639.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F639"><span class="emoji android">😹</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F639"><span class="emoji symbola">😹</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f639" href="#emoji-modal" title="cat_face_with_tears_of_joy">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f639.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F639</td>
                        <td class="code">\xF0\x9F\x98\xB9</td>
                        <td class="name">CAT FACE WITH TEARS OF JOY</td>
                    </tr>
                     
                    <tr id="emoji-1f63a">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F63A"><span class="emoji">😺</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f63a" href="#emoji-modal" title="U+1F63A">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f63a.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F63A"><span class="emoji android">😺</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F63A"><span class="emoji symbola">😺</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f63a" href="#emoji-modal" title="smiling_cat_face_with_open_mouth">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f63a.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F63A</td>
                        <td class="code">\xF0\x9F\x98\xBA</td>
                        <td class="name">SMILING CAT FACE WITH OPEN MOUTH</td>
                    </tr>
                     
                    <tr id="emoji-1f63b">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F63B"><span class="emoji">😻</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f63b" href="#emoji-modal" title="U+1F63B">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f63b.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F63B"><span class="emoji android">😻</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F63B"><span class="emoji symbola">😻</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f63b" href="#emoji-modal" title="smiling_cat_face_with_heart_shaped_eyes">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f63b.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F63B</td>
                        <td class="code">\xF0\x9F\x98\xBB</td>
                        <td class="name">SMILING CAT FACE WITH HEART-SHAPED EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f63c">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F63C"><span class="emoji">😼</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f63c" href="#emoji-modal" title="U+1F63C">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f63c.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F63C"><span class="emoji android">😼</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F63C"><span class="emoji symbola">😼</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f63c" href="#emoji-modal" title="cat_face_with_wry_smile">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f63c.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F63C</td>
                        <td class="code">\xF0\x9F\x98\xBC</td>
                        <td class="name">CAT FACE WITH WRY SMILE</td>
                    </tr>
                     
                    <tr id="emoji-1f63d">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F63D"><span class="emoji">😽</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f63d" href="#emoji-modal" title="U+1F63D">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f63d.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F63D"><span class="emoji android">😽</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F63D"><span class="emoji symbola">😽</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f63d" href="#emoji-modal" title="kissing_cat_face_with_closed_eyes">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f63d.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F63D</td>
                        <td class="code">\xF0\x9F\x98\xBD</td>
                        <td class="name">KISSING CAT FACE WITH CLOSED EYES</td>
                    </tr>
                     
                    <tr id="emoji-1f63e">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F63E"><span class="emoji">😾</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f63e" href="#emoji-modal" title="U+1F63E">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f63e.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F63E"><span class="emoji android">😾</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F63E"><span class="emoji symbola">😾</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f63e" href="#emoji-modal" title="pouting_cat_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f63e.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F63E</td>
                        <td class="code">\xF0\x9F\x98\xBE</td>
                        <td class="name">POUTING CAT FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f63f">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F63F"><span class="emoji">😿</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f63f" href="#emoji-modal" title="U+1F63F">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f63f.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F63F"><span class="emoji android">😿</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F63F"><span class="emoji symbola">😿</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f63f" href="#emoji-modal" title="crying_cat_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f63f.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F63F</td>
                        <td class="code">\xF0\x9F\x98\xBF</td>
                        <td class="name">CRYING CAT FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f640">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F640"><span class="emoji">🙀</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f640" href="#emoji-modal" title="U+1F640">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f640.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F640"><span class="emoji android">🙀</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F640"><span class="emoji symbola">🙀</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f640" href="#emoji-modal" title="weary_cat_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f640.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F640</td>
                        <td class="code">\xF0\x9F\x99\x80</td>
                        <td class="name">WEARY CAT FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f645">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F645"><span class="emoji">🙅</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f645" href="#emoji-modal" title="U+1F645">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f645.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F645"><span class="emoji android">🙅</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F645"><span class="emoji symbola">🙅</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f645" href="#emoji-modal" title="face_with_no_good_gesture">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f645.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F645</td>
                        <td class="code">\xF0\x9F\x99\x85</td>
                        <td class="name">FACE WITH NO GOOD GESTURE</td>
                    </tr>
                     
                    <tr id="emoji-1f646">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F646"><span class="emoji">🙆</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f646" href="#emoji-modal" title="U+1F646">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f646.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F646"><span class="emoji android">🙆</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F646"><span class="emoji symbola">🙆</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f646" href="#emoji-modal" title="face_with_ok_gesture">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f646.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F646</td>
                        <td class="code">\xF0\x9F\x99\x86</td>
                        <td class="name">FACE WITH OK GESTURE</td>
                    </tr>
                     
                    <tr id="emoji-1f647">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F647"><span class="emoji">🙇</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f647" href="#emoji-modal" title="U+1F647">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f647.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F647"><span class="emoji android">🙇</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F647"><span class="emoji symbola">🙇</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f647" href="#emoji-modal" title="person_bowing_deeply">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f647.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F647</td>
                        <td class="code">\xF0\x9F\x99\x87</td>
                        <td class="name">PERSON BOWING DEEPLY</td>
                    </tr>
                     
                    <tr id="emoji-1f648">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F648"><span class="emoji">🙈</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f648" href="#emoji-modal" title="U+1F648">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f648.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F648"><span class="emoji android">🙈</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F648"><span class="emoji symbola">🙈</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f648" href="#emoji-modal" title="see_no_evil_monkey">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f648.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F648</td>
                        <td class="code">\xF0\x9F\x99\x88</td>
                        <td class="name">SEE-NO-EVIL MONKEY</td>
                    </tr>
                     
                    <tr id="emoji-1f649">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F649"><span class="emoji">🙉</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f649" href="#emoji-modal" title="U+1F649">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f649.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F649"><span class="emoji android">🙉</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F649"><span class="emoji symbola">🙉</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f649" href="#emoji-modal" title="hear_no_evil_monkey">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f649.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F649</td>
                        <td class="code">\xF0\x9F\x99\x89</td>
                        <td class="name">HEAR-NO-EVIL MONKEY</td>
                    </tr>
                     
                    <tr id="emoji-1f64a">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F64A"><span class="emoji">🙊</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f64a" href="#emoji-modal" title="U+1F64A">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f64a.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F64A"><span class="emoji android">🙊</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F64A"><span class="emoji symbola">🙊</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f64a" href="#emoji-modal" title="speak_no_evil_monkey">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f64a.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F64A</td>
                        <td class="code">\xF0\x9F\x99\x8A</td>
                        <td class="name">SPEAK-NO-EVIL MONKEY</td>
                    </tr>
                     
                    <tr id="emoji-1f64b">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F64B"><span class="emoji">🙋</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f64b" href="#emoji-modal" title="U+1F64B">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f64b.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F64B"><span class="emoji android">🙋</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F64B"><span class="emoji symbola">🙋</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f64b" href="#emoji-modal" title="happy_person_raising_one_hand">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f64b.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F64B</td>
                        <td class="code">\xF0\x9F\x99\x8B</td>
                        <td class="name">HAPPY PERSON RAISING ONE HAND</td>
                    </tr>
                     
                    <tr id="emoji-1f64c">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F64C"><span class="emoji">🙌</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f64c" href="#emoji-modal" title="U+1F64C">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f64c.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F64C"><span class="emoji android">🙌</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F64C"><span class="emoji symbola">🙌</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f64c" href="#emoji-modal" title="person_raising_both_hands_in_celebration">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f64c.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F64C</td>
                        <td class="code">\xF0\x9F\x99\x8C</td>
                        <td class="name">PERSON RAISING BOTH HANDS IN CELEBRATION</td>
                    </tr>
                     
                    <tr id="emoji-1f64d">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F64D"><span class="emoji">🙍</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f64d" href="#emoji-modal" title="U+1F64D">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f64d.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F64D"><span class="emoji android">🙍</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F64D"><span class="emoji symbola">🙍</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f64d" href="#emoji-modal" title="person_frowning">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f64d.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F64D</td>
                        <td class="code">\xF0\x9F\x99\x8D</td>
                        <td class="name">PERSON FROWNING</td>
                    </tr>
                     
                    <tr id="emoji-1f64e">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F64E"><span class="emoji">🙎</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f64e" href="#emoji-modal" title="U+1F64E">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f64e.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F64E"><span class="emoji android">🙎</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F64E"><span class="emoji symbola">🙎</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f64e" href="#emoji-modal" title="person_with_pouting_face">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f64e.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F64E</td>
                        <td class="code">\xF0\x9F\x99\x8E</td>
                        <td class="name">PERSON WITH POUTING FACE</td>
                    </tr>
                     
                    <tr id="emoji-1f64f">
                        <td class="preview">
                            <a class="emoji" href="#emoji-modal" title="U+1F64F"><span class="emoji">🙏</span></a>
                        </td>
                        <td class="preview theme-apple">
                            <a class="emoji sprite sprite-1f64f" href="#emoji-modal" title="U+1F64F">
                                <img class="emoji" data-src="/static/images/emoji/emoji-apple/1f64f.png">
                            </a>
                        </td> 
                        <td class="preview theme-android">
                            <a class="emoji" href="#emoji-modal" title="U+1F64F"><span class="emoji android">🙏</span></a>
                        </td>
                        <td class="preview theme-symbola">
                            <a class="emoji" href="#emoji-modal" title="U+1F64F"><span class="emoji symbola">🙏</span></a>
                        </td>
                        <td class="preview theme-phantom">
                             
                                <a class="emoji sprite sprite-1f64f" href="#emoji-modal" title="person_with_folded_hands">
                                    <img class="emoji" data-src="/static/images/emoji/emoji-phantom/1f64f.png">
                                </a> 
                        </td> 
                        <td class="code">U+1F64F</td>
                        <td class="code">\xF0\x9F\x99\x8F</td>
                        <td class="name">PERSON WITH FOLDED HANDS</td>
                    </tr>
                         
                </tbody>
            </table>
	
	</body>


</html>